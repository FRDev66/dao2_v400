
package zIgzAg.collection;

import java.util.SortedMap;

/**
 * Cette interface prolonge l'interface <i>java.util.SortedMap</i>,
 * mais avec des entiers comme clés.
 *
 * @author  Julien Buret
 * @version 1.00, 12/02/01
 */


public interface IntSortedMap extends IntMap,SortedMap {

    SortedMap subMap(int fromKey, int toKey);

    SortedMap headMap(int toKey);

    SortedMap tailMap(int fromKey);

    int firstIntKey();

    int lastIntKey();
  }
