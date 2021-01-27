package homework_03;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 程序启动后，要求用户输入一个文件名，如果文件存在则提示
 * 并要求用户更换，直到该文件还不存在为止，然后将这个文件
 * 在当前目录中创建出来。
 *
 * 单词记一记:
 * exsits 存在
 * create 创建
 * new    新的
 *
 * @author Xiloer
 *
 */
public class Day03_01 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入文件名");
        while(true){
            String fileName = scan.nextLine();
            File file = new File(fileName);
            if (file.exists()){
                System.out.println("已存在，请重新输入：");
            }
            file.createNewFile();
            System.out.println("创建成功");
            break;
        }
    }
}
