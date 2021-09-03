package fanshe;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Class<Demo3> c1 = Demo3.class;
        try {
            Constructor<Demo3> constructor = c1.getConstructor();
            Demo3 demo = constructor.newInstance();
            Field field = c1.getDeclaredField("abc");
            field.setAccessible(true);
            field.set(demo, "123");
            System.out.println(demo);

//			BeanInfo bean = Introspector.getBeanInfo(需要获取实例信息的反射Class数据);
            BeanInfo bean = Introspector.getBeanInfo(c1);
            PropertyDescriptor[] pds = bean.getPropertyDescriptors();
            System.out.println(Arrays.toString(pds));
            for (PropertyDescriptor propertyDescriptor : pds) {
                if(propertyDescriptor.getDisplayName().equals("class"))continue;
                if(!propertyDescriptor.getPropertyType().getSimpleName().equals("String"))continue;
                propertyDescriptor.getDisplayName();
                propertyDescriptor.getName();
                propertyDescriptor.getReadMethod();
                Method method = propertyDescriptor.getWriteMethod();
                System.out.println(method);
                method.invoke(demo, "内省修改数据");
//				修改内省关系，替换默认set方法
                propertyDescriptor.setWriteMethod(null);
//				修改内省关系，替换默认get方法
                propertyDescriptor.setReadMethod(null);
            }
            System.out.println(demo);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
class Demo3{
    private String abc;
    private String msg;
    private boolean boo;
    public boolean isBoo() {
        return boo;
    }
    public void setBoo(boolean boo) {
        this.boo = boo;
    }
    public String getAbc() {
        return abc;
    }
    public void setAbc(String abc) {
        this.abc = abc;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    @Override
    public String toString() {
        return "Demo3 [" + (abc != null ? "abc=" + abc + ", " : "") + (msg != null ? "msg=" + msg : "") + "]";
    }
    public Demo3() {
        // TODO Auto-generated constructor stub
    }
}
