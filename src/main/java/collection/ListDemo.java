package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * java.util.list接口
 * List继承自Collection，集合中最常用的一类集合。特点是：可以存放重复元素并且有序
 * List中定义了一套可以通过下标操作元素的方法，使用更方便
 *
 * List常用实现类
 * java.util.ArrayList  内部使用数组实现，查询性能更好
 * java.util.LinkedList 内部使用链表实现，增删性能更好
 * 在没有对集合对应性能有严苛要求时，通常首选ArrayList
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        /*
            E get(int index)
            获取当前集合中指定下标处对应的元素
         */
        String str = list.get(0);//获取集合中第一个元素
        System.out.println(str);
        for (int i=0;i<list.size();i++){
            str = list.get(i);
            System.out.println(str);
        }
        /*
            E set(int index,E e)
            将给定元素设置到指定位置，返回值为该位置原有元素
            相当于是替换现有元素
         */
        String old = list.set(1,"2");
        System.out.println(old);
        System.out.println(list);
        /*
            在不创建新集合的前提下，将元素反转
            就利用get，set方法实现
         */
        for(int i=0;i<list.size()/2;i++){
            String s = list.get(i);
            s = list.set(list.size()-1-i, s);
            list.set(i, s);
//            String s = list.set(i,list.set(list.size()-1-i,list.get(i)));

        }
        /*
            java.util.Collections是集合的工具类，里面提供了很多操作集合的方法
            reverse(List list)用于反转集合元素
         */
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);


    }
}