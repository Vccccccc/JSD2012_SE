package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * JDK5之后推出了一个特性：增强型for循环，也称为新循环
 * 新循环不取代传统for循环的工作，他只是用来让我们用相同的语法遍历集合和数组使用
 */
public class NewForDemo {
    public static void main(String[] args) {
        String[] arr = {"one","two","three","four","five"};
        for (int i=0;i<arr.length;i++){
            String str = arr[i];
            System.out.println(str);
        }
        //新循环在编译器编译后改为普通for循环
        for (String str : arr){//冒号前是接收类型，冒号后是要遍历的数组
            System.out.println(str);
        }
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        /*
            新循环遍历集合会被编译器改回成迭代器。因此注意，不要在遍历过程中通过集合
            的方法增删元素
         */
        for (String str : c){//冒号前是接收类型，冒号后是要遍历的集合
            System.out.println(str);
        }

    }
}
