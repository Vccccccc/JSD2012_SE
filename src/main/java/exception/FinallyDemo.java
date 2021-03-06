package exception;

/**
 * finally块
 * finally块是异常处理机制的最后一块。可以直接跟在try语句块之后或者
 * 最后一个catch之后
 * finally块可以保证只要程序执行到try语句块中，无论try语句块是否抛出
 * 异常，finally块都必然执行。
 * 通常我们会将释放资源一类的操作放在finally中确保运行。例如IO操作后
 * 的关闭。
 */
public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了...");
        try{
            String s = "123";
            System.out.println(s.length());
            return;//结束方法
        }catch (Exception e){
            System.out.println("异常啦！");
            //要执行完finally，方法才会真正的return
            //当程序运行进入try中，不管有没有异常，finally都会执行。
        }finally {
            System.out.println("我也没招！");
        }
        System.out.println("程序结束了...");
    }
}
