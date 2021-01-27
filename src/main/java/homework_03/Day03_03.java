package homework_03;

import java.io.*;

/**
 * 将当前目录下的所有文件都复制一份，复制的文件命名为:原
 * 文件名_cp.后缀
 * 比如原文件为:test.dat
 * 复制后的文件为:test_cp.dat
 *
 *
 * @author Xiloer
 *
 */
public class Day03_03 {
    public static void main(String[] args) throws IOException {
        File dir = new File(".");
        if(dir.isDirectory()){
            FileFilter filter = (file)->file.isFile();
            File[] subs = dir.listFiles(filter);
            for(int i=0;i<subs.length;i++){
                String fileName = subs[i].getName();
                String copyname = fileName.replace(".", "_cp.");
                RandomAccessFile o = new RandomAccessFile(fileName, "r");
                RandomAccessFile n = new RandomAccessFile(copyname, "rw");
                int d;
                while ((d=o.read())==-1){
                    n.write(d);
                }
                System.out.println("over");
                o.close();
                n.close();
            }

        }
    }
}
