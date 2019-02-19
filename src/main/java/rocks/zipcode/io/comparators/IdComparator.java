package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item>{

    public int compare(Item o1, Item o2) {
        int Id1  = (int)(long)o1.getId();
        int Id2  = (int)(long)o2.getId();
        return Id1-Id2;
    }
}
