package string;

/**+
 * String支持正则表达式方法二：
 * String[] split(String regex);
 * 将当前字符串按照满足正则表达式的部分进行拆分，将拆分后的所有部分
 * 以一个String数组形式返回
 */
public class SplitDemo {
    public static void main(String[] args) {
        String str = "alsjd2ljda8848489asdjlkasdk";
        //按照数字部分拆分
        String[] arr = str.split("[0-9]+");
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        /**
         * 当遇到连续出现可拆分项时，中间会拆分出一个空字符串。
         * 如果字符串最开始是可拆分项，则拆分后的第一项是空字符串。
         * 注意：如果字符串末尾出现连续可拆分项，所有拆分出来的控制符串会自动忽略
         */
        //按照"."拆分
        String str1 = "123.132.132.321.456";
        String[] arr1 = str1.split("\\.");
        System.out.println(arr1.length);
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
