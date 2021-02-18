package io;

import javax.management.relation.InvalidRelationTypeException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成文件的复制操作
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        /**
         *      1:创建文件输入流读取原文件
         *      2:创建文件输出流写入复制文件
         *      3:循环块读写完成复制
         *      4:关闭两个流
         */
        FileInputStream file = new FileInputStream("fos.txt");
        FileOutputStream file1 = new FileOutputStream("fos_cp.txt");
        byte[] data = new byte[1024 * 10];
        int len;
        while ((len = file.read(data) )!= -1) {
            file1.write(data, 0, len);
        }
        System.out.println("over");
        file.close();
        file1.close();
    }
}
