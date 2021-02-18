package exception;

/**
 * 异常处理机制中的try-catch
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了...");
        try {//try语句块用来扩上可能出错的代码片段
            //String s = null;
            //String s = "";
            String s = "abc";
            /**
             * 如果str为null时，当虚拟机执行到下面的代码会发现这里存在空指针异常
             * 于是虚拟机会实例化一个空指针异常的实例，并将其抛出。抛出后会检查报
             * 错的这句话是否被异常处理机制控制，如果没有则会将该异常抛出到当前方
             * 法外面，由调用该方法的代码去解决（这里相当于抛出到main方法外面）
             */
            System.out.println(s.length());
            System.out.println(s.charAt(0));
            System.out.println(Integer.parseInt(s));
            //try语句块中报错代码一下内容都不会被执行！！！
            System.out.println("!!!!!!!!");
        }catch (NullPointerException e){//catch用来捕获try中出现的指定异常并予以解决
            System.out.println("空指针异常");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("字符串下标越界了");
            /**
             * catch超类异常的意义：
             * 当try中某几类异常希望使用相同处理办法时，可以catch这些异常的超类
             * 当最后一个catch处捕获到Exception也可以避免因为一个未处理的异常导
             * 致程序中断。
             *
             * 当多个catch的异常之间存在继承关系时，子类型异常要在上面现行捕获，超类
             * 异常在下。否则编译不通过。
             */
        }catch (Exception e){
            System.out.println("反正就是出错了，你打我呀！");
        }
        System.out.println("程序结束了...");
    }
}
