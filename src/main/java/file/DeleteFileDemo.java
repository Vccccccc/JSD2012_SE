package file;

import java.io.File;

/**
 * 删除一个文件
 */
public class DeleteFileDemo {
    public static void main(String[] args) {
        //将Test.txt文件删除
        //相对路径中"./"可以不写，不写默认就是从"./"开始的
        File dir = new File("Test.txt");
        if(dir.exists()){
            dir.delete();
            System.out.println("已删除");
        }else{
            System.out.println("文件不存在");
        }
    }
}
