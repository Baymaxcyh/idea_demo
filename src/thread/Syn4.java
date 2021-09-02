package thread;

/**
 * @author Hiro
 */
public class Syn4 {
    static Object obj = new Object();

    public void method1() {
        synchronized (obj) {

        }
    }

    public void method2() {
        synchronized (obj) {

        }
    }
}
