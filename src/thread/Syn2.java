package thread;

/**
 * @author Hiro
 */
public class Syn2 {
    public static void main(String[] args) {
        Syn2 tb2 = new Syn2();
        tb2.method3();
        method2();
//		上述都是同步的方法，如果在两个线程中同时触发，就会阻挡
    }

    //	第二种 在静态方法上使用synchronized
//	标记在方法区 类信息上
    public static synchronized void method1() {

    }

    public static synchronized void method2() {

    }

    public synchronized void method3() {

    }

    public synchronized void method4() {

    }
}
