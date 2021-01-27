package raf;

import org.omg.CORBA.LongLongSeqHelper;

import java.awt.*;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RAF读取基本类型数据，以及RAF指针的操作
 */
public class RAFDemo3 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
        //获取RAF的指针位置，默认从0开始
        long pos = raf.getFilePointer();
        System.out.println("pos:"+pos);

        /**
         * 向文件中写入一个int最大值
         * int最大值的2进制：
         * 01111111 11111111 11111111 11111111
         * imax>>>24                  vvvvvvvv
         * 00000000 00000000 00000000 01111111
         * imax>>>16
         * 00000000 00000000 01111111 11111111
         * iamx>>>8
         * 00000000 01111111 11111111 11111111
         * raf.dat文件数据：
         * 01111111 11111111 11111111 11111111
         */
        int imax = Integer.MAX_VALUE;
        raf.write(imax>>>24 );
        System.out.println("pos:"+raf.getFilePointer());
        raf.write(imax>>>16 );
        System.out.println("pos:"+raf.getFilePointer());
        raf.write(imax>>>8 );
        System.out.println("pos:"+raf.getFilePointer());
        raf.write(imax);
        System.out.println("pos:"+raf.getFilePointer());
        raf.writeInt(imax);
        System.out.println("pos:"+raf.getFilePointer());
        raf.writeDouble(132.321);
        System.out.println("pos:"+raf.getFilePointer());
        raf.writeLong(13111111111l);
        System.out.println("pos:"+raf.getFilePointer());//24
        System.out.println("over");
        raf.seek(0);
        System.out.println("pos:"+raf.getFilePointer());//0
        int d = raf.readInt();
        System.out.println(d);
        System.out.println("pos:"+raf.getFilePointer());//4
        raf.seek(16);
        long l = raf.readLong();
        System.out.println(l);
        System.out.println("pos:"+raf.getFilePointer());
        raf.seek(16);
        System.out.println("pos:"+raf.getFilePointer());
        raf.writeLong(13123456789l);
        raf.seek(16);
        long ll = raf.readLong();
        System.out.println(ll);
        raf.close();

    }
}
