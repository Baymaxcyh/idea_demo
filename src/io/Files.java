package io;

import java.io.File;
import java.io.IOException;

import javax.swing.filechooser.FileSystemView;

/**
 * 文件
 */
public class Files {
    public static void main(String[] args) {
//		系统桌面文件夹
        File fsv = FileSystemView.getFileSystemView().getHomeDirectory();
//		File file = new File("精准的文件路径");
//		File file2 = new File("父路径", "相对路径");
        File file2 = new File(fsv, "桌面文件.txt");
        if(file2.exists()) {
            file2.delete();
        }
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

