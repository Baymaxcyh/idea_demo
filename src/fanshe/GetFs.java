package fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Date;

public class GetFs {
    public static void main(String[] args) {
        try {
            Test d = new Test();
            Class 反射1 = d.getClass();
            Class 反射2 = Test.class;
            try {
                Class 反射3 = Class.forName("文件路径");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
//	属性
            反射1.getFields();
            Field a= 反射1.getField("msg");
//		属性名
            a.getName();
//		属性类型 反射 Class
            a.getType();
//		属性值 分为 静态 与 实例操作方法
            a.get(null);	//静态属性
            a.get(d);		//实例属性

//	方法
            反射1.getMethods();
//		反射1.getMethod(方法名, 参数一类型的反射, 参数二类型的反射,....);
            Method method = 反射1.getMethod("method_name", String.class, Integer.class);
//			方法名
            method.getName();
//			返回值 返回值类型的反射
            method.getReturnType();
//			调用		分为静态与实例
            method.invoke(null, "1",2,new Date());  //静态方法的调用
            method.invoke(d, 1,2,3,4,5);			//实例方法的调用

//			参数获取 获取参数列表
            Parameter[] ps = method.getParameters();
            //			参数
            //			参数类型
            ps[0].getType();
            //			参数名
            ps[0].getName();
//	构造方法 构造器
            反射1.getConstructors();	//获取全部，逐个遍历识别
            Constructor con  = 反射1.getConstructor(String.class,Date.class);	//精准获取

            Parameter[] ps2 =con.getParameters();

            con.newInstance();
            con.newInstance("abc",1);
//	继承类
            反射1.getSuperclass();
//	注解
            反射1.getAnnotations();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
class Demo {
    String msg;
    public void show(Object... objs) {
        System.out.println(Arrays.toString(objs));
    }
    public void test() {
        show(1,2,3,4);
    }
}

