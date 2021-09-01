import java.util.HashMap;

public class Count {

    /*静态变量不能调用非静态资源*/
    /*jvm加载 java文件时， 就将static的空间分配完毕。不需要等待创建对象*/
    /*jvm内存空间， 堆， 栈 ， 常量池 ， 方法区 ， 本地方法栈， 寄存器*/
    /*在方法区中，立刻创建存储数据用的空间*/
    /*实例变量， 都有等到创建对象时才会分配内存空间*/
    /*实例方法，等到首次创建对象时才会分配访问地址*/

    public static HashMap<Object, Integer> map = new HashMap<Object, Integer>();
    public int add(Object obj){
        Integer count = map.get(obj);
        if (count == null){
            count = 1;
            map.put(obj, count);
        }else {
            map.put(obj, ++count);
        }
        return count;
    }
    public int sub(Object obj){
        Integer count = map.get(obj);
        if (count == null){
            count = 0;
        }else if (count == 1){
            count = 0;
            map.remove(obj);
        }else {
            map.put(obj, --count);
        }
        return 0;
    }
}
