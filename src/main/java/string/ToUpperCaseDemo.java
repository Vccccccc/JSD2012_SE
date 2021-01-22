package string;

/**
 * String toLowerCase()
 * 将当前字符串中的英文部分转换为全小写
 * String toUpperCase()
 * 将当前字符串中的英文部分转换为全大写
 */
public class ToUpperCaseDemo {
    public static void main(String[] args) {
        String str = "我爱Java";
        System.out.println(str);
        System.out.println(str.toUpperCase());//英文转成大写
        System.out.println(str.toLowerCase());//英文转成小写
    }
}
