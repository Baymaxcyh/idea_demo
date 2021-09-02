package io;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Hiro
 * 层次遍历
 */
public class ScanFileSq {
    public static LinkedList<File> list = new LinkedList<File>();

    public static void main(String[] args) {
        File[] root = File.listRoots();
        /*数组转换集合， 集合转换数组*/
        list = new LinkedList<File>(Arrays.asList(root));
        /*集合转换数组*/
//        ArrayList<File> l = new ArrayList<File>(Arrays.asList(root))

        while (!list.isEmpty()){
            File file = list.poll();
            if (file != null){
                query(file);
            }
        }
    }
    public static void query(File file){
        if (file.isDirectory()){
            try {
                File[] files = file.listFiles();
                for (File file2 : files){
                    if (file2.isDirectory()) {
                        list.add(file2);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
