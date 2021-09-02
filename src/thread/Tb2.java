package thread;

/**
 * @author Hiro
 */
public class Tb2 {
    public static void main(String[] args) {
        Thread2 t1 = new Thread2("t1");
        Thread2 t2 = new Thread2("t2");
        Thread2 t3 = new Thread2("t3");
        Thread2 t4 = new Thread2("t4");

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread thread3 = new Thread(t3);
        Thread thread4 = new Thread(t4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
//
class Thread2  implements Runnable{
    static int a = 0;
    String name = null;
    public Thread2(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(name+":"+a++);
        }
    }
}
