package thread;

/**
 * @author Hiro
 */
public class Singleton {
    private static Singleton dl = new Singleton();

    private Singleton() {

//		构造方法私有化
    }

    public static Singleton getObject() {
        return dl;
    }
}
