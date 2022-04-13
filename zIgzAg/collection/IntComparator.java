package zIgzAg.collection;

import java.util.Comparator;

/**
 * Cette interface prolonge l'interface <i>java.util.Comparator</i>,
 * mais pour comparer des entiers.
 *
 * @author  Julien Buret
 * @version 1.00, 12/02/01
 */


public interface IntComparator extends Comparator {

    int compare(int o1, int o2);

}
