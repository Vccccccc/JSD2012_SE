package socket;

import java.util.Arrays;

/**
 * 测试从数组中删除指定元素
 */
public class Test {
    public static void main(String[] args) {
        int[] allOut = {20,45,461,3,25,4,49,88,41,36};
        int pw = 49;
        System.out.println(Arrays.toString(allOut));
        //将pw从数组allOut中删除
        for(int i=0;i<allOut.length;i++){
            if(allOut[i]==pw){
                allOut[i] = allOut[allOut.length-1];
                break;
            }
        }
        System.out.println(Arrays.toString(allOut));
        allOut = Arrays.copyOf(allOut,allOut.length-1);
        System.out.println(Arrays.toString(allOut));
    }
}
