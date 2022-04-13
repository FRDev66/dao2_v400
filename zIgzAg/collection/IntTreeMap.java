package zIgzAg.collection;

import java.util.Map;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Set;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import java.io.Serializable;
import java.io.IOException;

/**
 * C'est l'équivalent d'une TreeMap avec des entiers pour clés.
 *
 * @author  Julien Buret
 * @version 1.00, 12/02/01
 */


public class IntTreeMap extends AbstractMap
                        implements IntSortedMap,Cloneable,Serializable{

 private IntComparator comparator = null;

 private transient Entry root = null;

 private transient int size = 0;

 private transient int modCount = 0;

 private void incrementSize(){modCount++;size++;}
 private void decrementSize(){modCount++;size--;}

 public IntTreeMap(){}

 public IntTreeMap(IntComparator c){
  this.comparator = c;
  }

 public IntTreeMap(Map m){
  putAll(m);
  }

 public IntTreeMap(IntSortedMap m) {
  comparator = (IntComparator)m.comparator();
  try{buildFromSorted(m.size(),(IntIterator) m.entrySet().iterator(), null, null);
     }
  catch(java.io.IOException cannotHappen){}
  catch(ClassNotFoundException cannotHappen){}
  }

 public int size() {
  return size;
  }

 public boolean containsKey(Object key) {
  return containsKey(key.hashCode());
  }

 public boolean containsKey(int key) {
  return getEntry(key) != null;
  }

 public boolean containsValue(Object value) {
  return (root==null ? false : (value==null ? valueSearchNull(root)
        		                            : valueSearchNonNull(root, value)));
  }

 private boolean valueSearchNull(Entry n) {
  if(n.value == null)
   return true;

  return (n.left  != null && valueSearchNull(n.left)) ||
         (n.right != null && valueSearchNull(n.right));
  }

 private boolean valueSearchNonNull(Entry n, Object value) {
  if(value.equals(n.value))
   return true;

  return (n.left  != null && valueSearchNonNull(n.left, value)) ||
         (n.right != null && valueSearchNonNull(n.right, value));
  }

 public Object get(int key) {
  Entry p = getEntry(key);
  return (p==null ? null : p.value);
  }

 public Object get(Object key) {
  return get(key.hashCode());
  }

 public Comparator comparator() {
  return comparator;
  }

 public Object firstKey() {
  return new Integer(firstIntKey());
  }

 public int firstIntKey() {
  return key(firstEntry());
  }

 public Object lastKey() {
  return new Integer(lastIntKey());
  }

 public int lastIntKey() {
  return key(lastEntry());
  }

 public void putAll(Map map) {
  int mapSize = map.size();
  if (size==0 && mapSize!=0 && map instanceof IntSortedMap) {
   Comparator c = ((IntSortedMap)map).comparator();
   if (c == comparator || (c != null && c.equals(comparator))) {
    ++modCount;
    try {buildFromSorted(mapSize,(IntIterator)map.entrySet().iterator(),null, null);
        }
    catch (java.io.IOException cannotHappen) {}
    catch (ClassNotFoundException cannotHappen) {}
    return;
    }
   }
  super.putAll(map);
  }

 private Entry getEntry(int key) {
  Entry p = root;
  while (p != null) {
   int cmp = compare(key,p.key);
   if (cmp == 0)
	return p;
    else if (cmp < 0)
		   p = p.left;
	      else p = p.right;
   }
  return null;
  }

 private Entry getCeilEntry(int key){
  Entry p = root;
  if (p==null)
   return null;

  while (true) {
   int cmp = compare(key, p.key);
   if (cmp == 0) {
	return p;
	}
   else
    if (cmp < 0) {
	 if (p.left != null)
	  p = p.left;
	  else return p;
	 }
     else {
	  if (p.right != null) {
	   p = p.right;
	   }
       else {
		Entry parent = p.parent;
		Entry ch = p;
		while (parent != null && ch == parent.right) {
		 ch = parent;
		 parent = parent.parent;
		 }
		return parent;
		}
	 }
   }
  }

 private Entry getPrecedingEntry(int key) {
  Entry p = root;
  if (p==null)
   return null;

  while (true) {
   int cmp = compare(key, p.key);
   if (cmp > 0) {
	if (p.right != null)
	 p = p.right;
	 else return p;
	}
    else {
	 if (p.left != null) {
	  p = p.left;
	  }
      else {
	   Entry parent = p.parent;
	   Entry ch = p;
	   while (parent != null && ch == parent.left) {
		ch = parent;
		parent = parent.parent;
		}
	   return parent;
	   }
	 }
   }
  }

 private static int key(Entry e) {
  if (e==null)
   throw new NoSuchElementException();
  return e.key;
  }

 public Object put(Object key, Object value) {
  return put(key.hashCode(),value);
  }

 public Object put(int key, Object value) {
  Entry t = root;

  if (t == null) {
   incrementSize();
   root = new Entry(key, value, null);
   return null;
   }

  while (true) {
   int cmp = compare(key, t.key);
   if (cmp == 0) {
    return t.setValue(value);
    }
   else if (cmp < 0) {
	if (t.left != null) {
     t = t.left;
   	 }
     else {
	  incrementSize();
	  t.left = new Entry(key, value, t);
	  fixAfterInsertion(t.left);
	  return null;
	  }
	}
    else{
	 if (t.right != null) {
	  t = t.right;
	  }
      else {
       incrementSize();
       t.right = new Entry(key, value, t);
       fixAfterInsertion(t.right);
       return null;
       }
	 }
   }
  }

 public Object remove(Object key) {
  return remove(key.hashCode());
  }

 public Object remove(int key) {
  Entry p = getEntry(key);
  if (p == null)
   return null;

  Object oldValue = p.value;
  deleteEntry(p);
  return oldValue;
  }

 public void clear() {
  modCount++;
  size = 0;
  root = null;
  }

 public Object clone() {
  IntTreeMap clone = null;
  try{clone = (IntTreeMap)super.clone();
	 }
  catch (CloneNotSupportedException e) {throw new InternalError();}

  clone.root = null;
  clone.size = 0;
  clone.modCount = 0;
  clone.keySet = clone.entrySet = null;
  clone.values = null;

  try {clone.buildFromSorted(size, (IntIterator)entrySet().iterator(), null, null);
      }
  catch (java.io.IOException cannotHappen) {}
  catch (ClassNotFoundException cannotHappen) {}

  return clone;
  }

 private transient Set keySet = null;
 private transient Set entrySet = null;
 private transient Collection values = null;

 public Set keySet() {
  if (keySet == null) {
   keySet = new AbstractIntSet() {

                public java.util.Iterator iterator() {
	             return new Iterator(KEYS);
	             }

                public int size() {
                 return IntTreeMap.this.size();
               	 }

                public boolean contains(int o) {
                 return containsKey(o);
                 }

                public boolean contains(Object o) {
                 return contains(o.hashCode());
                 }

		        public boolean remove(int o) {
                 int oldSize = size;
                 IntTreeMap.this.remove(o);
		         return size != oldSize;
		         }

                public boolean remove(Object o) {
                 return remove(o.hashCode());
		         }

		        public void clear() {
		         IntTreeMap.this.clear();
		         }

	           };
   }
  return keySet;
  }

 public Collection values() {
  if (values == null) {
   values = new AbstractCollection() {

              public java.util.Iterator iterator() {
               return new Iterator(VALUES);
               }

              public int size() {
               return IntTreeMap.this.size();
               }

              public boolean contains(Object o) {
               for (Entry e = firstEntry(); e != null; e = successor(e))
                if (valEquals(e.getValue(), o))
                 return true;
                return false;
                }

		      public boolean remove(Object o) {
               for (Entry e = firstEntry(); e != null; e = successor(e)) {
                if (valEquals(e.getValue(), o)) {
                 deleteEntry(e);
                 return true;
                 }
                }
               return false;
		       }

              public void clear() {
               IntTreeMap.this.clear();
               }

             };
    }
    return values;
   }

  public Set entrySet() {
   if (entrySet == null) {
	entrySet = new AbstractSet() {

                 public java.util.Iterator iterator() {
                  return new Iterator(ENTRIES);
                  }

                 public boolean contains(Object o) {
                  if (!(o instanceof IntMap.Entry))
                   return false;
                  IntMap.Entry entry = (IntMap.Entry)o;
                  Object value = entry.getValue();
                  Entry p = getEntry(entry.getIntKey());
                  return p != null && valEquals(p.getValue(), value);
                  }

		         public boolean remove(Object o) {
                  if (!(o instanceof IntMap.Entry))
                   return false;
                  IntMap.Entry entry = (IntMap.Entry)o;
                  Object value = entry.getValue();
                  Entry p = getEntry(entry.getIntKey());
                  if (p != null && valEquals(p.getValue(), value)) {
                   deleteEntry(p);
                   return true;
                   }
                  return false;
                  }

                 public int size() {
                  return IntTreeMap.this.size();
                  }

                 public void clear() {
                  IntTreeMap.this.clear();
                  }

               };
    }
   return entrySet;
   }

  public SortedMap subMap(Object fromKey, Object toKey) {
	return subMap(fromKey.hashCode(), toKey.hashCode());
    }

  public SortedMap subMap(int fromKey,int toKey) {
   return new SubMap(fromKey, toKey);
   }

  public SortedMap headMap(Object toKey) {
   return headMap(toKey.hashCode());
   }

  public SortedMap headMap(int toKey) {
   return new SubMap(toKey, true);
   }

  public SortedMap tailMap(Object fromKey) {
   return tailMap(fromKey.hashCode());
   }

  public SortedMap tailMap(int fromKey) {
   return new SubMap(fromKey, false);
   }

  private class SubMap extends AbstractMap
             	       implements IntSortedMap{

   private boolean fromStart = false, toEnd = false;
   private int     fromKey,           toKey;

   SubMap(int fromKey, int toKey) {
    if (compare(fromKey, toKey) > 0)
	 throw new IllegalArgumentException("fromKey > toKey");
	this.fromKey = fromKey;
	this.toKey = toKey;
	}

   SubMap(int key, boolean headMap) {
    compare(key, key);
    if (headMap){
     fromStart = true;
     toKey = key;
     }
     else{
      toEnd = true;
      fromKey = key;
      }
	}

   SubMap(boolean fromStart, int fromKey, boolean toEnd, int toKey){
    this.fromStart = fromStart;
    this.fromKey= fromKey;
    this.toEnd = toEnd;
    this.toKey = toKey;
    }

   public boolean isEmpty() {
	return entrySet.isEmpty();
	}

   public boolean containsKey(Object key) {
	return containsKey(key.hashCode());
	}

   public boolean containsKey(int key){
    return inRange(key) && IntTreeMap.this.containsKey(key);
	}

   public Object get(Object key) {
    return get(key.hashCode());
    }

   public Object get(int key){
    if (!inRange(key)) return null;
	return IntTreeMap.this.get(key);
	}

   public Object remove(int key){
    return IntTreeMap.this.remove(key);
    }

   public Object remove(Object key){
    return remove(key.hashCode());
    }

   public Object put(Object key, Object value) {
	return put(key.hashCode(),value);
	}

   public Object put(int key, Object value) {
	if (!inRange(key))
     throw new IllegalArgumentException("key out of range");
	return IntTreeMap.this.put(key, value);
	}

   public Comparator comparator() {
    return comparator;
    }

   public int firstIntKey(){
    int first = key(fromStart ? firstEntry():getCeilEntry(fromKey));
    if (!toEnd && compare(first, toKey) >= 0)
     throw(new NoSuchElementException());
    return first;
    }

   public Object firstKey() {
    return new Integer(firstIntKey());
    }

   public int lastIntKey() {
    int last = key(toEnd ? lastEntry() : getPrecedingEntry(toKey));
    if (!fromStart && compare(last, fromKey) < 0)
     throw(new NoSuchElementException());
    return last;
    }

   public Object lastKey() {
    return new Integer(lastIntKey());
    }

   private transient Set entrySet = new EntrySetView();

   public Set entrySet() {
    return entrySet;
	}

   private class EntrySetView extends AbstractSet {
	private transient int size = -1, sizeModCount;

	public int size() {
	 if (size == -1 || sizeModCount != IntTreeMap.this.modCount) {
	  size = 0;  sizeModCount = IntTreeMap.this.modCount;
	  java.util.Iterator i = iterator();
	  while(i.hasNext()){
	   size++;
	   i.next();
	   }
	  }
	 return size;
	 }

	public boolean isEmpty() {
	 return !iterator().hasNext();
	 }

	public boolean contains(Object o) {
	 if (!(o instanceof IntMap.Entry))
	  return false;
	 IntMap.Entry entry = (IntMap.Entry)o;
	 int key = entry.getIntKey();
     if (!inRange(key))
      return false;
     IntTreeMap.Entry node = getEntry(key);
     return node != null && valEquals(node.getValue(), entry.getValue());
	 }

	public boolean remove(Object o) {
     if (!(o instanceof IntMap.Entry))
      return false;
     IntMap.Entry entry = (IntMap.Entry)o;
     int key = entry.getIntKey();
     if (!inRange(key))
      return false;
     IntTreeMap.Entry node = getEntry(key);
     if (node!=null && valEquals(node.getValue(),entry.getValue())){
	  deleteEntry(node);
      return true;
      }
     return false;
	 }

    public java.util.Iterator iterator() {
	 return new Iterator(
                  (fromStart ? firstEntry() : getCeilEntry(fromKey)),
                  (toEnd     ? null	      : getCeilEntry(toKey)));
	 }

	}

   public SortedMap subMap(Object fromKey, Object toKey) {
    return subMap(fromKey.hashCode(),toKey.hashCode());
    }

   public SortedMap subMap(int fromKey, int toKey) {
    if (!inRange2(fromKey))
	 throw new IllegalArgumentException("fromKey out of range");
    if (!inRange2(toKey))
     throw new IllegalArgumentException("toKey out of range");
    return new SubMap(fromKey, toKey);
    }

   public SortedMap headMap(Object toKey) {
    return headMap(toKey.hashCode());
    }

   public SortedMap headMap(int toKey) {
    if (!inRange2(toKey))
     throw new IllegalArgumentException("toKey out of range");
    return new SubMap(fromStart, fromKey, false, toKey);
    }

   public SortedMap tailMap(Object fromKey) {
    return tailMap(fromKey.hashCode());
    }

   public SortedMap tailMap(int fromKey) {
    if (!inRange2(fromKey))
     throw new IllegalArgumentException("fromKey out of range");
    return new SubMap(false, fromKey, toEnd, toKey);
    }

   private boolean inRange(int key) {
	return (fromStart || compare(key, fromKey) >= 0) &&
           (toEnd     || compare(key, toKey)   <  0);
	}

   private boolean inRange2(int key) {
	return (fromStart || compare(key, fromKey) >= 0) &&
           (toEnd     || compare(key, toKey)   <= 0);
    }

   }

  private static final int KEYS = 0;
  private static final int VALUES = 1;
  private static final int ENTRIES = 2;

  private class Iterator implements IntIterator {
   private int type;
   private int expectedModCount = IntTreeMap.this.modCount;
   private Entry lastReturned = null;
   private Entry next;
   private Entry firstExcluded = null;

   Iterator(int type) {
	this.type = type;
	next = firstEntry();
	}

   Iterator(Entry first, Entry firstExcluded) {
	type = ENTRIES;
	next = first;
    this.firstExcluded = firstExcluded;
	}

   public boolean hasNext() {
	return next != firstExcluded;
	}

   public Object next(){
	if (next == firstExcluded)
	 throw new NoSuchElementException();
	if (modCount != expectedModCount)
	 throw new ConcurrentModificationException();

	lastReturned = next;
	next = successor(next);
	return (type == KEYS ? new Integer(lastReturned.key) :
		   (type == VALUES ? lastReturned.value : lastReturned));
	}

   public int nextInt(){
    if (next == firstExcluded)
	 throw new NoSuchElementException();
	if (modCount != expectedModCount)
	 throw new ConcurrentModificationException();

	lastReturned = next;
	next = successor(next);
	return (type == KEYS ? lastReturned.key :
		   (type == VALUES ? lastReturned.value.hashCode() : lastReturned.hashCode()));
    }

   public void remove(){
	if (lastReturned == null)
	 throw new IllegalStateException();
	if (modCount != expectedModCount)
	 throw new ConcurrentModificationException();

	deleteEntry(lastReturned);
	expectedModCount++;
	lastReturned = null;
	}

   }

  private int compare(int k1,int k2) {
   return (comparator==null ? (k1<k2 ? -1 : (k1==k2 ? 0 : 1))
				             : comparator.compare(k1, k2));
   }

  private static boolean valEquals(Object o1, Object o2) {
   return (o1==null ? o2==null : o1.equals(o2));
   }

  private static final boolean RED   = false;
  private static final boolean BLACK = true;

  static class Entry implements IntMap.Entry {
   int key;
   Object value;
   Entry left = null;
   Entry right = null;
   Entry parent;
   boolean color = BLACK;

   Entry(int key, Object value, Entry parent) {
    this.key = key;
    this.value = value;
    this.parent = parent;
    }

   public int getIntKey(){
    return key;
    }

   public Object getKey(){
    return new Integer(key);
    }

   public Object getValue() {
    return value;
    }

   public Object setValue(Object value) {
    Object oldValue = this.value;
    this.value = value;
    return oldValue;
    }

   public boolean equals(Object o) {
    if (!(o instanceof IntMap.Entry))
    return false;
    IntMap.Entry e = (IntMap.Entry)o;
    return key==e.getIntKey() && valEquals(value,e.getValue());
    }

   public int hashCode() {
    int keyHash = key;
    int valueHash = (value==null ? 0 : value.hashCode());
    return keyHash ^ valueHash;
    }

   public String toString() {
    return Integer.toString(key) + "=" + value;
    }

   }

  private Entry firstEntry() {
   Entry p = root;
   if (p != null)
	while (p.left != null)
	 p = p.left;
   return p;
   }

  private Entry lastEntry() {
   Entry p = root;
   if (p != null)
    while (p.right != null)
   p = p.right;
   return p;
   }

  private Entry successor(Entry t) {
   if (t == null)
    return null;
   if (t.right != null) {
    Entry p = t.right;
    while (p.left != null)
     p = p.left;
    return p;
	}
    else {
	 Entry p = t.parent;
	 Entry ch = t;
	 while (p != null && ch == p.right) {
	  ch = p;
	  p = p.parent;
	  }
     return p;
	 }
   }

  private static boolean colorOf(Entry p) {
   return (p == null ? BLACK : p.color);
   }

  private static Entry  parentOf(Entry p) {
   return (p == null ? null: p.parent);
   }

  private static void setColor(Entry p, boolean c) {
   if (p != null)  p.color = c;
   }

  private static Entry  leftOf(Entry p) {
   return (p == null)? null: p.left;
   }

  private static Entry  rightOf(Entry p) {
   return (p == null)? null: p.right;
   }

  private void rotateLeft(Entry p) {
   Entry r = p.right;
   p.right = r.left;
   if (r.left != null)
	r.left.parent = p;
   r.parent = p.parent;
   if (p.parent == null)
	root = r;
    else if (p.parent.left == p)
	      p.parent.left = r;
          else p.parent.right = r;
   r.left = p;
   p.parent = r;
   }

  private void rotateRight(Entry p) {
   Entry l = p.left;
   p.left = l.right;
   if (l.right != null) l.right.parent = p;
   l.parent = p.parent;
   if (p.parent == null)
	root = l;
    else if (p.parent.right == p)
	      p.parent.right = l;
	      else p.parent.left = l;
   l.right = p;
   p.parent = l;
   }


  private void fixAfterInsertion(Entry x) {
   x.color = RED;

   while (x != null && x != root && x.parent.color == RED) {
	if (parentOf(x) == leftOf(parentOf(parentOf(x)))) {
	 Entry y = rightOf(parentOf(parentOf(x)));
	 if (colorOf(y) == RED) {
	  setColor(parentOf(x), BLACK);
	  setColor(y, BLACK);
	  setColor(parentOf(parentOf(x)), RED);
	  x = parentOf(parentOf(x));
	  }
      else {
	   if (x == rightOf(parentOf(x))) {
	    x = parentOf(x);
		rotateLeft(x);
		}
	   setColor(parentOf(x), BLACK);
	   setColor(parentOf(parentOf(x)), RED);
	   if (parentOf(parentOf(x)) != null)
		rotateRight(parentOf(parentOf(x)));
	   }
	 }
     else {
	  Entry y = leftOf(parentOf(parentOf(x)));
	  if (colorOf(y) == RED) {
	   setColor(parentOf(x), BLACK);
	   setColor(y, BLACK);
	   setColor(parentOf(parentOf(x)), RED);
	   x = parentOf(parentOf(x));
	   }
       else {
		if (x == leftOf(parentOf(x))) {
		 x = parentOf(x);
		 rotateRight(x);
		 }
		setColor(parentOf(x),  BLACK);
		setColor(parentOf(parentOf(x)), RED);
		if (parentOf(parentOf(x)) != null)
		 rotateLeft(parentOf(parentOf(x)));
		}
	 }
    }
   root.color = BLACK;
   }

  private void deleteEntry(Entry p) {
   decrementSize();
   if (p.left != null && p.right != null) {
	Entry s = successor(p);
	swapPosition(s, p);
	}

   Entry replacement = (p.left != null ? p.left : p.right);

   if (replacement != null) {
	replacement.parent = p.parent;
	if (p.parent == null)
	 root = replacement;
	 else if (p == p.parent.left)
	  	   p.parent.left  = replacement;
	       else p.parent.right = replacement;

    p.left = p.right = p.parent = null;

	if (p.color == BLACK)
	 fixAfterDeletion(replacement);
	}
    else
     if (p.parent == null)
	  root = null;
	 else {
      if (p.color == BLACK)
	   fixAfterDeletion(p);
	  if (p.parent != null) {
	   if (p == p.parent.left)
	    p.parent.left = null;
	    else if (p == p.parent.right)
		      p.parent.right = null;
	   p.parent = null;
	   }
	}
   }

  private void fixAfterDeletion(Entry x) {
   while (x != root && colorOf(x) == BLACK) {
	if (x == leftOf(parentOf(x))) {
	 Entry sib = rightOf(parentOf(x));
  	 if (colorOf(sib) == RED) {
	  setColor(sib, BLACK);
	  setColor(parentOf(x), RED);
	  rotateLeft(parentOf(x));
	  sib = rightOf(parentOf(x));
	  }

	 if (colorOf(leftOf(sib))  == BLACK &&  colorOf(rightOf(sib)) == BLACK) {
	  setColor(sib,  RED);
	  x = parentOf(x);
	  }
      else {
	   if (colorOf(rightOf(sib)) == BLACK) {
		setColor(leftOf(sib), BLACK);
		setColor(sib, RED);
		rotateRight(sib);
		sib = rightOf(parentOf(x));
		}
	   setColor(sib, colorOf(parentOf(x)));
	   setColor(parentOf(x), BLACK);
	   setColor(rightOf(sib), BLACK);
       rotateLeft(parentOf(x));
	   x = root;
	   }
	 }
     else {
	  Entry sib = leftOf(parentOf(x));

	  if (colorOf(sib) == RED) {
	   setColor(sib, BLACK);
	   setColor(parentOf(x), RED);
	   rotateRight(parentOf(x));
	   sib = leftOf(parentOf(x));
	   }

	  if (colorOf(rightOf(sib)) == BLACK && colorOf(leftOf(sib)) == BLACK) {
	   setColor(sib,  RED);
	   x = parentOf(x);
	   }
      else {
	   if (colorOf(leftOf(sib)) == BLACK) {
		setColor(rightOf(sib), BLACK);
		setColor(sib, RED);
		rotateLeft(sib);
		sib = leftOf(parentOf(x));
		}
	   setColor(sib, colorOf(parentOf(x)));
	   setColor(parentOf(x), BLACK);
	   setColor(leftOf(sib), BLACK);
	   rotateRight(parentOf(x));
	   x = root;
	   }
	 }
    }

   setColor(x, BLACK);
   }

  private void swapPosition(Entry x, Entry y) {
   Entry px = x.parent, lx = x.left, rx = x.right;
   Entry py = y.parent, ly = y.left, ry = y.right;
   boolean xWasLeftChild = px != null && x == px.left;
   boolean yWasLeftChild = py != null && y == py.left;

   if (x == py) {
	x.parent = y;
	if (yWasLeftChild) {
	 y.left = x;
	 y.right = rx;
	 }
    else {
	 y.right = x;
	 y.left = lx;
	 }
	}
    else {
	 x.parent = py;
	 if (py != null) {
	  if (yWasLeftChild)
	   py.left = x;
	   else py.right = x;
	  }
	 y.left = lx;
	 y.right = rx;
	 }

   if (y == px) {
	y.parent = x;
	if (xWasLeftChild) {
	 x.left = y;
	 x.right = ry;
	 }
    else {
	 x.right = y;
	 x.left = ly;
	 }
	}
    else {
	 y.parent = px;
	 if (px != null) {
	  if (xWasLeftChild)
	   px.left = y;
	  else px.right = y;
	  }
	 x.left = ly;
	 x.right = ry;
	 }

    if (x.left != null)
	 x.left.parent = x;
	if (x.right != null)
	 x.right.parent = x;
	if (y.left != null)
	 y.left.parent = y;
	if (y.right != null)
	 y.right.parent = y;

	boolean c = x.color;
	x.color = y.color;
	y.color = c;

	if (root == x)
	 root = y;
	 else if (root == y)
	       root = x;
    }

   private void writeObject(java.io.ObjectOutputStream s)
                                     throws java.io.IOException {
	s.defaultWriteObject();

	s.writeInt(size);

    for (java.util.Iterator i = entrySet().iterator(); i.hasNext(); ) {
     Entry e = (Entry)i.next();
     s.writeInt(e.key);
     s.writeObject(e.value);
	 }
    }

   private void readObject(final java.io.ObjectInputStream s)
                            throws java.io.IOException, ClassNotFoundException {
	s.defaultReadObject();

    int size = s.readInt();

    buildFromSorted(size, null, s, null);
    }
/*
   void readTreeSet(int size, java.io.ObjectInputStream s, Object defaultVal)
        throws java.io.IOException, ClassNotFoundException {
     buildFromSorted(size, null, s, defaultVal);
     }

   void addAllForTreeSet(IntSortedSet set, Object defaultVal) {
    try{buildFromSorted(set.size(), set.iterator(), null, defaultVal);
       }
    catch (java.io.IOException cannotHappen) {}
    catch (ClassNotFoundException cannotHappen) {}
    }
*/


   private void buildFromSorted(int size, IntIterator it,
                                  java.io.ObjectInputStream str,
                                  Object defaultVal)
                               throws  java.io.IOException, ClassNotFoundException {
    this.size = size;
	root = buildFromSorted(0, 0, size-1, computeRedLevel(size),it, str, defaultVal);
    }

   private static Entry buildFromSorted(int level, int lo, int hi,
                                         int redLevel,
                                         IntIterator it,
                                         java.io.ObjectInputStream str,
                                         Object defaultVal)
                               throws  java.io.IOException, ClassNotFoundException {
    if (hi < lo) return null;

    int mid = (lo + hi) / 2;

    Entry left  = null;
    if (lo < mid)
     left = buildFromSorted(level+1, lo, mid - 1, redLevel,it, str, defaultVal);

    int key;
    Object value;
    if (it != null) {
     if (defaultVal==null) {
      IntMap.Entry entry = (IntMap.Entry) it.next();
       key = entry.getIntKey();
       value = entry.getValue();
       }
      else {
       key = it.nextInt();
       value = defaultVal;
       }
      }
      else {
       key = str.readInt();
       value = (defaultVal != null ? defaultVal : str.readObject());
       }

    Entry middle =  new Entry(key, value, null);

    if (level == redLevel)
     middle.color = RED;

    if (left != null) {
     middle.left = left;
     left.parent = middle;
     }

    if (mid < hi) {
     Entry right = buildFromSorted(level+1, mid+1, hi, redLevel,it, str, defaultVal);
     middle.right = right;
     right.parent = middle;
     }

    return middle;
    }

   private static int computeRedLevel(int sz) {
    int level = 0;
    for (int m = sz - 1; m >= 0; m = m / 2 - 1)
     level++;
    return level;
    }

  public boolean equals(Object o) {
   if (o == this)
    return true;
   if(!(o instanceof IntTreeMap))
    return false;
   IntTreeMap t = (IntTreeMap) o;
   if (t.size() != size())
    return false;

   java.util.Iterator i = entrySet().iterator();
   while (i.hasNext()) {
    Entry e = (Entry) i.next();
	int key = e.getIntKey();
	Object value = e.getValue();
	if (value == null) {
	 if (!(t.get(key)==null && t.containsKey(key)))
	  return false;
	 }
     else
	  if (!value.equals(t.get(key)))
	   return false;
    }
   return true;
   }

  public String toString() {
   int max = size() - 1;
   StringBuffer buf = new StringBuffer();
   java.util.Iterator i = entrySet().iterator();

   buf.append("{");
   for (int j = 0; j <= max; j++) {
    Entry e = (Entry) (i.next());
	buf.append(e.getIntKey() + "=" + e.getValue());
	if (j < max)
     buf.append(", ");
	}
   buf.append("}");
   return buf.toString();
   }


  }
