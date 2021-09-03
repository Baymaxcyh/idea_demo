package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import javax.swing.filechooser.FileSystemView;

/**
 * 輸出流
 */
public class Outliu {
    public static void main(String[] args) {
        File home = FileSystemView.getFileSystemView().getHomeDirectory();
        File file = new File(home,"test.txt");

        try {
            FileOutputStream fos = new FileOutputStream(file,true);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write("这是第一行数据");
            bw.newLine();
            bw.write("这是第二行数据");
            bw.newLine();
//			关闭流 ，两个作用， 1、防止使用了缓冲技术的流输出不完整
//			2、方式流占用资源锁，其他重新无法访问文件
            bw.close();

        } catch (Exception e) {
        }

    }
}

