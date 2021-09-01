package thread;

/**
 * @author Hiro
 */
public class Tb1 {
    public static void main(String[] args) {
        Object group1 = new Object();
        Object group2 = new Object();
//		线程组
        Thread1 t1 = new Thread1("T-1",group1);
        Thread1 t2 = new Thread1("T-2",group1);
        Thread1 t3 = new Thread1("T-3",group2);
        Thread1 t4 = new Thread1("T-4",group2);
//	    run是在当前线程中直接运行，且线性运行
//		t1.run();
//		t2.run();
//		t3.run();
        t1.start();
        t2.start();
        t3.start();

//		t1.getId();
//		t1.interrupt();		标记中断，提示该线程要结束运行
//		t1.join();			等待接入
//		t1.wait();			休眠
//		t1.stop();			停止线程，强制停止，已经不推荐使用
//		自结束
    }
}

class Thread1 extends Thread{
    //	输入run alt+/
    static Object obj = null;
    static int a = 1;
    public Thread1(String string,Object obj) {
        super(string);
        this.obj = obj;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (obj) {
                System.out.println(getName()+"\t"+a++);
            }

        }
    }
}
