package string;

public class Test {
    public static void main(String[] args) {
        String s1 = getHostName("www.tedu.cn");
        String s2 = getHostName("http://www.tarena.com");
        String s3 = getHostName("doc.canglaoshi.com.cn");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
    public static String getHostName(String address){
        int start = address.indexOf(".")+1;//第一个"."之后第一个位置
        int end = address.indexOf(".", start);//地址中第二个"."的位置
        return address.substring(start,end);
    }
}
