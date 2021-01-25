package homework;

public class Day02_01 {
    public static void main(String[] args) {
        long l = 2151611231L;
        //       2151611231
        //10000000  00111110  11111011  01011111
        //  8  0      3   e     f   b     5   f
        long l1 = (l>>>56)&0xff;//
        long l2 = (l>>>48)&0xff;//
        long l3 = (l>>>40)&0xff;//
        long l4 = (l>>>32)&0xff;//10000000
        long l5 = (l>>>24)&0xff;//00111110
        long l6 = (l>>>16)&0xff;//11111011
        long l7 = (l>>>8)&0xff;//01011111
        long l8 = l&0xff;//
        System.out.println(Long.toBinaryString(l));
        System.out.println(Long.toBinaryString(l1));
        System.out.println(Long.toBinaryString(l2));
        System.out.println(Long.toBinaryString(l3));
        System.out.println(Long.toBinaryString(l5));
        System.out.println(Long.toBinaryString(l6));
        System.out.println(Long.toBinaryString(l7));
        System.out.println(Long.toBinaryString(l8));
        long ll = l1<<56|l2<<48|l3<<40|l4<<32|l5<<24|l6<<16|l7<<8|l8;
        System.out.println(Long.toBinaryString(ll));
        System.out.println(ll);
        split(2);


    }
    public static void split(int i){
        String s = Integer.toBinaryString(i);
        System.out.println(s);
        for(int j=0;j<=s.length();j++){
            int index = s.length()-4;
            s = s.substring(0,index);
            System.out.println(s);
        }

    }
}
