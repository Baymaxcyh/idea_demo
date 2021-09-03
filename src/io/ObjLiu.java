package io;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.filechooser.FileSystemView;

/**
 * xiang liu
 */
public class ObjLiu {
    public static void main(String[] args) {
//		序列化对象 obj = new 序列化对象("123", "aergerge", "13");
//		write(obj);
        ObjSq obj = (ObjSq) read();
        System.out.println(obj);
    }
    public static void write(Object obj) {
        File home = FileSystemView.getFileSystemView().getHomeDirectory();
        File file = new File(home,"data.dll");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
        }catch(Exception e) {
        }
    }
    public static Object read() {
        Object  obj = null;
        File home = FileSystemView.getFileSystemView().getHomeDirectory();
        File file = new File(home,"data.dll");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = ois.readObject();
            ois.close();
        }catch(Exception e) {
        }
        return obj;
    }
}

