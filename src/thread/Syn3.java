package thread;

public class Syn3 {
    Object obj = new Object();

    public static void main(String[] args) {

    }

    public void method1() {
        synchronized (obj) {

        }
    }

    public void method2() {
        synchronized (obj) {

        }
    }

    public void method3() {
        synchronized (this) {

        }
    }
}
