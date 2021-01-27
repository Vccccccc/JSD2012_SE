package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFCopyDemo {
    public static void main(String[] args) throws IOException {
        /**
         * 复制原理：从原文件中顺序读取每个字节并写入到另一个文件中
         */
        RandomAccessFile raf =
                new RandomAccessFile("2.jpg","r");
        RandomAccessFile copy =
                new RandomAccessFile("2_cp.jpg","rw");
        //用来记录每次读取到的字节
        int d;
        while ((d=raf.read())!=-1){
            copy.write(d);
        }
        System.out.println("over");
        raf.close();
        copy.close();
    }
}
