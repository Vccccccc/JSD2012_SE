package homework_01;

import java.util.Scanner;

/**
 * 要求用户在控制台输入自己的用户名。
 * 然后要求做如下验证工作:
 * 1:用户名不能为空(只要有一个字符)
 * 2:用户名必须在20个字以内
 * @author Xiloer
 *
 */
public class Day01_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = scan.nextLine();
        if(name.length()==0){
            System.out.println("用户名不能为空");
        }else if(name.length()>20){
            System.out.println("不能超过20字符");
        }else{
            System.out.println(name);
        }
      }
    }
