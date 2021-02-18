package homework_04;

import javax.naming.Name;
import javax.print.attribute.standard.JobOriginatingUserName;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * 用户登录功能
 * 程序启动后，要求用户输入用户名和密码
 * 然后去user.dat文件中比对
 * 成功则输出:登录成功
 * 失败则输出:登录失败，用户名或密码不正确
 *
 * 登录失败的条件:用户名输入正确但是密码不正确，或者用户名
 * 输入不正确(user.dat文件中没有此人)
 *
 * @author Xiloer
 *
 */
public class Day04_03 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String un = s.nextLine();
        System.out.println("请输入密码：");
        String pw = s.nextLine();
        RandomAccessFile raf = new RandomAccessFile("user.dat", "r");
        for(int i=0;i<raf.length()/100;i++){
            raf.seek(i*100);
            byte[] data = new byte[32];
            raf.read(data);
            String username = new String(data,"UTF-8").trim();
            if(username.equals(un)){
                raf.read(data);
                String password = new String(data,"UTF-8").trim();
                if(password.equals(pw)){
                    System.out.println("登陆成功");
                }
                System.out.println("密码错误");
            }else if(i==raf.length()/100-1){
                System.out.println("用户名不存在");
            }
        }
        raf.close();
    }
}
