package io;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.filechooser.FileSystemView;

public class LiuYan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ahh:mm:ss");
        while(true) {
            System.out.print("输入文字：");
            String str = in.nextLine();
            str = "留言时间："+sdf.format(new Date())+"\t\t留言内容："+str;
            write(str);
            System.out.println();
        }
    }
    public static void write(String str) {
        File home = FileSystemView.getFileSystemView().getHomeDirectory();
        File file = new File(home, "data.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file,true);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(str);
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

