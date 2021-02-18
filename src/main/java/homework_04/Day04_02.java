package homework_04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 完成修改昵称工作
 *
 * 程序启动后，要求用户输入用户名和新的昵称
 * 然后修改user.dat文件中该用户的昵称
 * 如果输入的用户不存在，则输出"查无此人"
 *
 * 思路:
 * 可以分几步实现:
 * 1:首先获取用户输入的用户名和新的昵称
 * 2:尝试循环读取user.dat文件中的每个用户名并打桩输出到控制台
 * 3:在读取用户名没有问题后，加上一个判断，判断该用户名是否为当前
 *   用户输入的用户名，匹配上则打桩输出
 * 4:如果匹配测试没问题，在分支中将指针移动到这条记录的昵称位置，
 *   需要思考昵称位置的计算。
 *   然后将昵称转换为字节后扩容到32字节写入覆盖即可。
 * @author Xiloer
 *
 */
public class Day04_02 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String un = s.nextLine();
        //String nn = s.nextLine();
        RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");
        for (int i=0;i<raf.length()/100;i++){
            raf.seek(i*100);
            byte[] data = new byte[32];
            raf.read(data);
            String username = new String(data,"UTF-8").trim();
            //System.out.println(username);
            if(username.equals(un)) {
                System.out.println("匹配");
                System.out.println("请修改昵称：");
                String nn = s.nextLine();
                raf.seek(i*100+64);
                data = nn.getBytes("UTF-8");
                data = Arrays.copyOf(data, 32);
                raf.write(data);
                String nickname = new String(data, "UTF-8").trim();
                System.out.println(nickname);
                break;
            }else if(i==raf.length()/100-1){
                System.out.println("查无此人");
            }
        }
        raf.close();
    }
}
