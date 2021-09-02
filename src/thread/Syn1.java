package thread;

/**
 * @author Hiro
 */
public class Syn1 {
    //	第一种 方式 synchronized 修饰在实例方法上
//	实例方法是需要创建对象 对象.方法() 的方式使用
//	synchronized 的 标记信息就会标记在这个对象上
    public synchronized void method1() {

    }

    public synchronized void method2() {

    }

    public static void main(String[] args) {
        Syn1 tb1 = new Syn1();
        //1线程
        tb1.method1();

        //2线程
        tb1.method2();

//		如果有两个线程同时使用了这个对象的两个方法，这个方法，
//		就会自动同步，但是如果创建多个对象，对象与对象间不会有
//		同步效果。
        Singleton.getObject();
    }
}
