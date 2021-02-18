package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合的某些操作是受元素equals方法影响的，例如contains,remove操作
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(2,3));
        c.add(new Point(4,5));
        c.add(new Point(6,5));
        c.add(new Point(4,3));
        System.out.println(c);

        Point p = new Point(1,2);
        /*
            boolean contains(Object o)
            判断当前集合是否包含给定元素，若包含则返回true
            判断的依据是看给定元素与集合现有元素是否存在equals比较为true的，
            有则认为包含
         */
        boolean contains = c.contains(p);
        System.out.println("是否包含:"+contains);
        /*
            remove只删除一次
         */
        c.remove(p);
        System.out.println(c);

    }

}
