package com.company;

/**
 * @author Hiro
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread1 t1 =new Thread1();
        Thread1 t2 =new Thread1();
        Thread1 t3 =new Thread1();
        t1.start();
        t2.start();
        t3.start();
    }
}

class Thread1 extends Thread{
    int a = 1;
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++){
            System.out.println(getName() + a++);
        }
    }
}