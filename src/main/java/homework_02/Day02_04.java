package homework_02;
/**
 * 执行程序，分析并解决问题
 *
 * NumberFormatException出现的情况通常是由包装类将字符串解析为基本类型时,由于字符串内容不能正确描述基本类型导致该异常.
 * 数字    格式      异常
 *
 *
 * @author Xiloer
 *
 */
public class Day02_04 {
    public static void main(String[] args) {
        /*
         * 原因:num的123后有空格，parseInt()不能识别
         */
        String num = "123";
        int d = Integer.parseInt(num);
        System.out.println(d);

        /*
         * 原因:num中有小数点
         */
        num = "123.456";
       double dou = Double.parseDouble(num);
        System.out.println(dou);

        /*
         * 原因:分号格式不对
         */
		num = "123";
		d = Integer.parseInt(num);
		System.out.println(d);
    }
}
