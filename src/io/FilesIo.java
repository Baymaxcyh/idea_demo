package io;

import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.IOException;

/**
 * @author Hiro
 */
public class FilesIo {
    public static void main(String[] args) {

        /*系统桌面文件夹*/
        File fsv = FileSystemView.getFileSystemView().getHomeDirectory();


/*        File file1 = new File("绝对路径");
        File file2 = new File("父路径", "相对路径");*/
        File file = new File(fsv, "桌面文件.txt");

        /*判断文件是否存在*/
        if (file.exists()){
            file.delete();
        }try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
