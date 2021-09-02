package io;

import java.io.File;
import java.util.Arrays;

/**
 * @author Hiro
 * 广度优先
 */
public class ScanFile {
    public static void main(String[] args) {

        /*查看电脑磁盘*/
        File[] root = File.listRoots();
        /*query有两个参数是，不能使用ScanFile::query函数提取式的方式运行*/
        Arrays.stream(root).forEach(ele ->{query(ele, 0);});
        /*先学习jdk1.8接口*/
    }
    public static void query(File file, int count){
        if (file.isDirectory()){
            write(count);
            System.out.println("文件夹："+file.getName());
            try{
                File[] list = file.listFiles();
                for (File file2 : list){
                    query(file2, count+1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            write(count);
            System.out.println("文件："+file.getName());
        }
    }
    public static void write(int count){
        for (int i = 0; i < count; i++){
            System.out.println("\t|");
        }
        System.out.println("---->");
    }
}