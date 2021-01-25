package integer;

/**
 * 包装类常见功能
 */
public class IntegerDemo02 {
    public static void main(String[] args) {
        //获取int最大值
        int imax = Integer.MAX_VALUE;
        System.out.println("imax:"+imax);
        int imin = Integer.MIN_VALUE;
        System.out.println("imin:"+imin);

        long lmax = Long.MAX_VALUE;
        System.out.println("lmax:"+lmax);
        double dou = Double.MAX_VALUE;
        System.out.println("dou:"+dou);
        byte bmax = Byte.MAX_VALUE;
        System.out.println("bmax:"+bmax);

        /**
         * 包装类提供了一个静态方法parseXXX(String line)
         * 可以将字符串解析为对应的基本类型数据，但是前提是该字符串
         * 正确描述了基本类型可以保存的值。否则会抛出异常：
         * java.lang.NumberFormatException
         */
        String line = "123";
        int in = Integer.parseInt(line);
        System.out.println(in);
        String line1 = "123.321";
        double dou1 = Double.parseDouble(line1);
        System.out.println(dou1);
    }
}
