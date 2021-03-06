package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 集合转换为数组
 * Collection提供了一个toArray方法，可以将一个集合转换为一个数组
 */
public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);
//        Object[] array = c.toArray();
        String[] array = c.toArray(new String[c.size()]);//数组长度通常大于等于c.size()
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));

    }
}
