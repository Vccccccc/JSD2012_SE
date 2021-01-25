package string;

/**
 * String支持正则表达式的方法三：
 *
 * String replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为给定的的内容
 */
public class ReplaceAllDemo {
    public static void main(String[] args) {
        String str = "ajsdk22jk4434kdjjf3323kaksdlk";
        //将字符串中的数字部分替换成“#number#”
        str.replaceAll("[0-9]+","#number#");
        System.out.println(str.replaceAll("[0-9]+","#number#"));
        //将字符串中的字母部分替换成“#A#”
        System.out.println(str.replaceAll("[a-zA-Z]+","#A#"));
        //将字符串中的数字部分替换成“”可以起到去除的效果
        System.out.println(str.replaceAll("[0-9]+",""));

        //和谐用语
        String regex = "(wanmlgb|dsb|wcnm|cnm|nmsl|nc|sb|fk)";
        String message = "cnm你个sb,nmsl丨";
        message = message.replaceAll(regex,"***");
        System.out.println(message);

    }
}
