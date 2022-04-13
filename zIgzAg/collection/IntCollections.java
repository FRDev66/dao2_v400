package zIgzAg.collection;

import java.io.Serializable;

/**
 * Cette classe fournie quelques méthodes spécifiques pour les classes
 * implémentant l'interface IntCollection.
 *
 * @author  Julien Buret
 * @version 1.00, 14/02/01
 */

public class IntCollections {

 private IntCollections() {}

 //comparateur inverse --->

 private static final IntComparator REVERSE_ORDER = new ReverseComparator();

 public static IntComparator reverseOrder() {
  return REVERSE_ORDER;
  }

 private static class ReverseComparator implements IntComparator,Serializable {

  public int compare(int k1, int k2) {
   return k1>k2 ? -1 : (k1==k2 ? 0 : 1);
   }

  public int compare(Object o1, Object o2){
   return compare(o1.hashCode(),o2.hashCode());
   }

  }


}
