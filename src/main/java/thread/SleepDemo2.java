package thread;

/**
 * sleep方法必须处理中断异常。(Thread还提供了其他会导致线程阻塞的方法，有很多都要求处理这个异常，情况时一样的)
 *
 * 当线程调用sleep方法处于睡眠阻塞的过程中，此时该线程的interrupt方法被调用时，会中断这个阻塞过程
 * 此时该方法会抛出中断异常。
 */
public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread(){
            public void run(){
                System.out.println("睡会");
                try {
                    Thread.sleep(100000000);
                }catch (InterruptedException e){
                    System.out.println("干嘛呐！");
                }
                System.out.println("醒了");
            }
        };
        Thread huang = new Thread(){
            public void run(){
                System.out.println("大锤80，小锤40");
                for(int i=0;i<5;i++) {
                    System.out.println("80!");
                   try {
                         Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                }
                System.out.println("搞定");
                lin.interrupt();//解除lin线程的沉默
            }
        };
        lin.start();
        huang.start();
    }
}
