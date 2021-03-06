package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 * 数组的工具类：Arrays提供了一个静态方法asList，可以将当前数组转换为一个List集合
 */
public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] arr = {"one","two","three","four","five"};
        List<String> list = Arrays.asList(arr);//数组可以转为List集合（可以存重复元素）
        System.out.println("arr:"+Arrays.toString(arr));
        System.out.println("list:"+list);
        //将集合中第二个元素换成“2”
        list.set(1,"2");
        System.out.println("list:"+list);
        //对集合的操作就是对原数组的操作
        System.out.println("arr:"+Arrays.toString(arr));
        /*
            由于数组都是定长的，因此该数组转换出来的集合是不能做增删元素操作的，否则会抛出异常
            java.lang.UnsupportedOperationException
            list.add("six")
         */
        //如果希望对集合做增删操作，则需要自行创建一个新集合
//        List<String> list2 = new ArrayList<>();
//        list2.addAll(list);
        /*
            所有的集合都支持一个参数为Collection的构造方法，作用是在创建集合的同时
            包含给定集合中的所有元素，下面创建list2集合的操作等同于上面两句
         */
        List<String> list2 = new ArrayList<>(list);
        System.out.println("list2:"+list2);
        list2.add("six");
        System.out.println("list2:"+list2);

    }
}
