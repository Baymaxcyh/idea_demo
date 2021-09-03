package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.filechooser.FileSystemView;


public class Logs {

    public static void main(String[] args) {
        Logs log1 = new Logs("logs");
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("输入日志内容");
            String str = scan.nextLine();
            log1.add(str);
        }
    }
    //	提取变量，可以改变日志的存储路径
    public String dicurl ="";
    public SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
    public LinkedList<LogInfo> list = new LinkedList<LogInfo>();
    public void add(String msg) {
        synchronized (list) {
            list.add(new LogInfo(msg));
        }
    }
    public void add(String msg,Object obj) {
        synchronized (list) {
            list.add(new LogInfo(msg, obj));
        }
    }
    public Logs(String dicurl) {
        this.dicurl = dicurl;
//		启动 计时器自动运行输入
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                write();
            }
        },1000,10000);
    }

    public void write() {
        File home = FileSystemView.getFileSystemView().getHomeDirectory();
        File dic = new File(home,dicurl);
//		mkdirs 创建目录
        dic.mkdirs();
        File infolog = new File(dic,sdf.format(new Date())+"info.csv");
        try {
            FileOutputStream fos = new FileOutputStream(infolog,true);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
            BufferedWriter bw  = new BufferedWriter(osw);
            synchronized (list) {
                while(!list.isEmpty()) {
                    LogInfo log = list.poll();
                    if(log != null) bw.write(log.toString());
                    bw.newLine();
                }
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
