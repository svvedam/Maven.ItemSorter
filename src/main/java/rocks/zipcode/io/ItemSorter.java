package rocks.zipcode.io;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {

    List<Item> itemList = new ArrayList<Item>();

    private Comparator<Item> comparator;

    public ItemSorter(Item[] items) {
        this.itemList = Arrays.asList(items);
    }

    public Item[] sort(Comparator<Item> comparator) {
        this.comparator = comparator;
        Collections.sort(itemList, comparator);
        Item[] resultList = new Item[itemList.size()];
        resultList = itemList.toArray(resultList);
        return resultList;
    }
}
