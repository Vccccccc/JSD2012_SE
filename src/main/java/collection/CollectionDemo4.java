package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合之间的操作
 */
public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("java");
        c1.add("c++");
        c1.add(".net");
        System.out.println("c1:"+c1);
        Collection c2 = new HashSet();
        c2.add("android");
        c2.add("ios");
        c2.add("java");
        System.out.println("c2:"+c2);
        /*
            boolean addAll(Collection c)
            将给定集合的所有元素添加到当前集合中，添加后当前集合发生了变化则返回true
         */
        c1.addAll(c2);
        System.out.println(c1);
        /*
            boolean containsAll(Collection c)
            判断当前集合是否包含给定集合中的所有元素，全包含则返回true
         */
        boolean containsAll = c1.containsAll(c2);
        System.out.println();
    }
}
