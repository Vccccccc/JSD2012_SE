package io;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 换冲字符输出流
 * java.io.BufferedWriter
 * 内部有缓冲区，可以块写文本数据来加快写出数据速度
 *
 * java.io.PrinterWriter
 * 具有自动行刷新的换冲字符输出流，内部总是连接BufferedWriter作为其缓冲功能
 */
public class PWDemo1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //向pw.txt文件中写入字符串
        /**
         * PW提供了直接对文件做操作的构造方法
         * PrintWriter(String path)
         * PrintWriter(File file)
         *
         */
        PrintWriter pw = new PrintWriter("pw.txt","utf-8");
        pw.println("我吹过你吹过的晚风");
        pw.println("空气里弥漫着心痛");
        System.out.println("over");
        pw.close();
    }
}
