package thread;

import java.util.Scanner;

/**
 * 线程提供的方法
 * static void sleep(long ms)
 * 该方法可以让运行这个方法的线程处于阻塞状态指定毫秒。超时后线程会自动回到Runnable状态
 * 再次获取时间片并发运行
 */
public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        /*
            完成一个倒计时程序，程序启动后要求用户输入一个数字。然后从该数字开始
            每秒递减，到0时提示时间到
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入数字：");
        int time = scan.nextInt();
        System.out.println("倒计时开始");
        try {
            while (time>0) {
                System.out.println(time);
                Thread.sleep(1000);
                time--;
            }
            System.out.println("时间到");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("程序结束了");
    }
}
