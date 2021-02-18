package io;

import java.io.*;

/**
 * 字符流 java.io.Reader和java.io.Writer
 * java将流按照读写单位划分为字节流与字符流
 * 字节流的超类是：java.io.InputStream和OutputStream
 * 而字符流的超类是：java.io.Reader和Writer
 * 它们的区别是读写单位不同，字节流最小读写单位为一个字节，
 * 而字符流最小读写单位为一个char（一个字符）
 *
 * 转换流：java.io.InputStreamReader和java.io.OutputStreamWriter
 * 转换流是常用的字符流实现类，他们是一对高级流，实际开发中我们不会直接
 * 使用他们，但是他们在流连接中是非常重要的一环
 *
 * 因为其他高级字符流都有一个共同的特点，在流连接中只能连接其他的字符流
 * 而真实读写设备的低级流通常都是字节流，这回导致这些高级字符流不能直接
 * 连接字节流。而转换流就在其中起到“转换器”的作用，他可以连接字节流，
 * 并且他又是字符流，其他的字符流可以连接他。而他就负责将字符转换为字节。
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        //向osw.txt中写入字符串
        FileOutputStream fos = new FileOutputStream("osw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        osw.write("相信古老信念，也相信情比金坚");
        osw.write("，爱绝不是一场谣言，书中曾有的故事，真心会得到成全");
        System.out.println("over");
        osw.close();
    }
}
