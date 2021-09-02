package thread;

/**
 * @author Hiro
 */
public class ThreadOp {
    public static void main(String[] args) {
        Thread3 t1 = new Thread3();
//		t1.setPriority(10);
        t1.start();
        try {
            Thread.sleep(3000);
            synchronized (Thread3.obj) {
                Thread3.obj.notifyAll();
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
class  Thread3 extends Thread{
    static Object obj = new Object();
    @Override
    public void run() {
        int a = 0;
        while(true) {
            System.out.println(a++);
            synchronized (obj) {
                if(a==100) {
//					线程 休眠
//					使用休眠功能会造成 所膨胀，让原本偏向锁，轻量级锁状态，直接变为重量级锁
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }
}

