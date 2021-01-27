package homework_02;

import java.util.Scanner;

/**
 * 程序需求:
 * 程序启动后，实例化一个Person，然后要求用户输入用户名
 * 和年龄.并加以验证:
 * 名字至少一个字符，否则输出:姓名不能为空!
 * 年龄必须是0-100之间的数字，否则输出:年龄不合法!
 *
 * 都输入正确时最后输出该用户信息
 *
 * 将下面写好的代码解除注释改正里面的错误使得程序可以正常
 * 运行。
 * 异常记一记:
 * 下面会出现的每一种异常先翻译异常的名字，然后解决该异常后
 * 思考是什么原因引起的错误并在注释中标注出来
 *
 * @author Xiloer
 *
 */
public class Day02_05 {
    public static void main(String[] args) {
//		Person p = new Person();
		Person p = new Person();
//		Scanner scanner = new Scnner(system.in);Scanner少些一个a，system的首字母没有大写
		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入姓名:");
		System.out.println("请输入姓名：");
//		String name = scanner.nextLine();
		String name = scanner.nextLine();
//		if(p.getName().length()==0) {//boolean条件应该为name.
		if(name.length()==0) {
//			System.out.println("姓名不能为空!");
			System.out.println("姓名不能为空！");
//		}else{
		}else {
//			p.setName(name);
			p.setName(name);
//		}
		}
//		System.out.println("请输入年龄:");
		System.out.println("请输入年龄：");
//		int age = scanner.nextInt();
		int age = scanner.nextInt();
//		if(p.getAge()<0&&p.getAge()>100) {条件应该为age
		if(age>=0&&age<=100) {
//			System.out.println("年龄不合法!");
			p.setAge(age);
//		}else{
		}else {

//			p.age = age;//age为私有属性，不能访问，需用方法
			System.out.println("年龄不合法");
//		}
		}
//
//		System.out.println("姓名:"+p.name);name为私有属性，不能访问，需用方法
		System.out.println("姓名："+p.getName());
//		System.out.println("年龄:"+p.age);age为私有属性，不能访问，需用方法
		System.out.println("年龄："+p.getAge());
    }


}
class Person{
    private String name;
    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
