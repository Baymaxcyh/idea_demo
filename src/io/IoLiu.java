package io;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

import javax.swing.filechooser.FileSystemView;
import javax.swing.text.FieldView;
/**
 * @author Hiro
 * Io流
 * */
public class IoLiu {
    /**
     * io 流    进 出	的参照物是内存
     * 字符流（文字）    字节流		转换流（设置字符集编码，字符->字节）
     * 字符 保存 ASCII 编码 Unicode
     * GBK utf-8
     *
     *
     *
     *
     *
     */
    public static void main(String[] args) {
        File home = FileSystemView.getFileSystemView().getHomeDirectory();
        File file = new File(home,"test.txt");
        try {
            byte[] bs = new byte[1024];
            FileInputStream fis = new FileInputStream(file);
//			int num = fis.read(bs);
//			System.out.println(num);
//			System.out.println(Arrays.toString(bs));
            char[] cs = new char[1024];
            InputStreamReader isr = new InputStreamReader(fis, "utf-8");
//			int num = isr.read(cs);
//			System.out.println(num);
//			System.out.println(Arrays.toString(cs));
            BufferedReader reader = new BufferedReader(isr);
            String str = null;
            while((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (Exception e) {

        }



    }



}

