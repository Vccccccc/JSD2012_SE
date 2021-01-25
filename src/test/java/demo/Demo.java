package demo;

import javax.xml.transform.Source;

public class Demo {
    public static void main(String[] args) {
        /*
        java中的数字都是2进制，向左移位时，每移动一位数值扩大2倍
         */
        int n = 1;
        int o = n<<1;
        int p = n<<2;
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        //int n = 50;//编译以后是110010
        /**
         * 运行期间n一直都是110010
         * Inter.toBinaryString(n) java提供的API方法
         * 执行这个方法就可以将n在内存中
         */
        /*System.out.println(Integer.toBinaryString(n));
        System.out.println(n);
        int n1 = -5;
        int n2 = ~n1+1;
        System.out.println(Integer.toBinaryString(n1));
        System.out.println(Integer.toBinaryString(~n1));
        System.out.println(Integer.toBinaryString(~n1+1));
        System.out.println(n2);*/
        /*
        11111111111111111111111111111011   -1-4=-5
        00000000000000000000000000000100    4
        00000000000000000000000000000101    5
         */


        /*for(int i=0;i<=200;i++){
            int num = i;
            System.out.println(Integer.toBinaryString(num));
        }*/
       /* int num1 = 0xf776d571;
        System.out.println(Integer.toBinaryString(num1));
        int num2 = 0x2964a3d6;
        System.out.println(Integer.toBinaryString(num2));
        int num3 = 0xb71555d4;
        System.out.println(Integer.toBinaryString(num3));
        int num4 = 0xf83e6636;
        System.out.println(Integer.toBinaryString(num4));
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        long maxl = Long.MAX_VALUE;
        long minl = Long.MIN_VALUE;
        System.out.println(Integer.toBinaryString(max));
        System.out.println(Integer.toBinaryString(min));
        System.out.println(Long.toBinaryString(maxl));
        System.out.println(Long.toBinaryString(minl));
        int nn = -1;
        long l = -1L;
        System.out.println(Integer.toBinaryString(nn));
        System.out.println(Long.toBinaryString(l));
        for(int i=-200;i<0;i++){
            System.out.println(Integer.toBinaryString(i));
        }
        int num_1 = 0b11111111111111111111111111111000;
        System.out.println(num_1);
        int num_2 = 0b11111111111111111111111111101101;
        System.out.println(num_2);
        int num_3 = 0b11111111111111111111111111100100;
        System.out.println(num_3);
        int num_4 = 0b11111111111111111111111111010011;
        System.out.println(num_4);
        System.out.println(Integer.toBinaryString(max));
        System.out.println(Integer.toBinaryString(max+1));*/
        /*int n = 0x6e188fd5;
        int m = 0xff;
        int k = n&m;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(k));*/
    }
}
//1111 0111 0111 0110 1101 0101 0111 0001
//1111 0111 0111 0110 1101 0101 0111 0001
//  f    7   7    6     d   5    7     1
/*
 * 0010   1001   0110   0100   1010   0011   1101   0110
 *   2     9      6      4      a     3      d       6
 * 0010   1001   0110   0100   1010   0011   1101   0110
 *
 * 1011   0111   0001   0101   0101   0101   1101   0100
 *   b      7      1      5      5     5       d     4
 * 1011   0111   0001   0101   0101   0101   1101   0100
 *
 * 1111   1000   0011   1110   0110   0110   0011   0110
 *   f      8     3       e      6      6      3     6
 * 1111   1000   0011   1110   0110   0110   0011   0110
 *
 * //负数
 * 11111111111111111111111111111000   -1-4-2-1=-8
 *
 * 11111111111111111111111111101101   -1-2-16=-19
 *
 * 11111111111111111111111111100100  -1-1-2-8-16=-28
 *
 * 11111111111111111111111111010011   -1-4-8-32=-45
 */
