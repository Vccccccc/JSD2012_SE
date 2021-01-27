package raf;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 简易记事本工具
 * 程序启动后要求用户输入一个文件名，然后对改文件进行写操作
 * 之后用户在控制台输入的每一行字符串都写入到改文件中（不考虑换行问题）
 * 当用户单独输入“exit”是程序退出
 */
public class Note {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入文件名:");
        String input = scan.nextLine();
        File file = new File(input);
        file.createNewFile();
        RandomAccessFile raf = new RandomAccessFile(input+".txt", "rw");
        System.out.println("请输入文本内容,退出请输入exit");
        for(int i=0;i<1;){
            String w = scan.nextLine();
            if("exit".equals(w)){
                break;
            }
            byte[] data = w.getBytes("UTF-8");
            raf.write(data);
        }
        System.out.println("over");
        raf.close();
    }
}
