package homework;
/**
 * 修改下面代码的编译
 * @author Xiloer
 *
 */
public class Day09_02 {
    public static void main(String[] args) {
		Thread t1 = new Thread() {
		    public void run() {
                Foo.dosome();
            }
		};
		Thread t2 = new Thread() {
		    public void run() {
                Foo.dosome();
            }
		};
		t1.start();
		t2.start();
    }
}
class Foo{
    public static void dosome() {
//		synchronized (this) {
        synchronized(Foo.class){
//			System.out.println("hello!");
            System.out.println("hello!");
//		}
        }
    }
}
