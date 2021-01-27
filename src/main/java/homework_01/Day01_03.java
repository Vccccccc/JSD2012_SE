package homework_01;

/**
 * 修改下面代码的错误
 *
 * 下面代码完成的功能是输出字符串中的每一个字符
 *
 * @author Xiloer
 *
 */
public class Day01_03 {
    //		string str = "hello world! i love java!";类名不对  首字母需要大写
    //		for(int i = 0;i<=str.length;i++) {} length方法缺少括号
    //			char c = i.charAt(i);作用域错误   语句应该放在大括号内    方法应该是字符串的方法 并不是i的
    //			System.err.println(c);语句应该放在大括号内并且不应该使用err输出，应该使用out
    public static void main(String[] args) {
        String str = "hello world! i love java!";
        System.out.println(str.length());
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
