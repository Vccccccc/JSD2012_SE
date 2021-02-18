package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 使用转换流读取文本
 */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        //将osw.txt文件中的字符读取回来
        FileInputStream fis = new FileInputStream("osw.txt");
        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        /**
         * int read()
         * 字符流的read()方法是读取一个字符，返回的是一个“char”
         * 但实际使用int型返回，因此该int值对应的2进制是“低16位”
         * 有效。如果int返回值为-1则表示文件末尾
         */
        int d = isr.read();
        System.out.print((char)d);
        while ((d=isr.read())!=-1){
            System.out.print((char)d);
        }

    }
}
