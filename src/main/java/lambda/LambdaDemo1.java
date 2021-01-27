package lambda;

import java.io.File;
import java.io.FileFilter;

/**
 * JDK8之后退出了一个新的特性：lambda表达式
 * lambda表达式可以用更简短的语法创建匿名内部类
 * 语法：
 * (参数列表)->{
 *     方法体
 * }
 * 需要注意的是，使用lambda表达式创建时实现的接口内只能有一个抽象方法
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        //使用匿名内部类方式创建的文件过滤器
        FileFilter filter = new FileFilter() {
            public boolean accept(File file) {
                return file.getName().contains("e");
            }
        };
        //lambda表达式写法
        /**
         *  编译器会结合程序语义分析出实现的是哪个结构，由于要求
         *  接口只能有一个抽象方法，所以也能知道重写的方法是什么。
         *  最终将它还原为匿名内部类
         */
        FileFilter filter1 = (File file)->{
            return file.getName().contains("e");
        };
        //参数类型可以忽略不写，只保留参数
        FileFilter filter2 = (file)->{
            return file.getName().contains("e");
        };
        /**
         * 当方法中只有一句代码时，那么方法体的“{}”可以忽略不写
         * 并且如果该方法要求有返回值，则return关键字也要一同忽略
         */
        FileFilter filter3 = (file)-> file.getName().contains("e");
    }
}