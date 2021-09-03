package root.action;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.Date;

import root.entity.po.Classinfo;
import root.entity.po.Student;
import root.entity.vo.PageVO;

public class Demo {
	public static void main(String[] args) {
		Classinfo ci = new Classinfo(435, "werwe", "sfdgsd", new Date());
		Student stu = new Student(435, "werwe","sdfsd", "sfdgsd", new Date());
		PageVO vo = new PageVO();
		集中(vo,stu,ci);
		System.out.println(vo);
	}
	public static void 集中(Object object, Object... object2) {
		for (Object obj : object2) {
			entityTransform(false,object,obj);
		}
	}
	public static void 分散(Object object, Object... object2) {
		for (Object obj : object2) {
			entityTransform(true,object,obj);
		}
	}
	private static void entityTransform(boolean boo,Object obj1, Object obj2) {
		try {
			Class class1 = obj1.getClass();
			Class class2 = obj2.getClass();
			BeanInfo beaninfo1 = Introspector.getBeanInfo(class1);
			BeanInfo beaninfo2 = Introspector.getBeanInfo(class2);
			PropertyDescriptor[] pds1 = beaninfo1.getPropertyDescriptors();
			PropertyDescriptor[] pds2 = beaninfo2.getPropertyDescriptors();
//			对两个对象的内省数组 做笛卡尔积,把class 内省关系排除
			for (PropertyDescriptor pd1 : pds1) {
				if(pd1.getDisplayName().equals("class"))continue;
				for (PropertyDescriptor pd2 : pds2) {
//					判断两个内省中相同的数据
					if(pd1.getName().equals(pd2.getName())) {
						if(boo) {
							pd2.getWriteMethod().invoke(obj2, pd1.getReadMethod().invoke(obj1));
						}else {
							pd1.getWriteMethod().invoke(obj1, pd2.getReadMethod().invoke(obj2));
						}
					}
				}
			}
		} catch (Exception e) {
		}
	}
}
//读取第一个模型和第二个模型， 把两个内省数组做笛卡尔积。
//找出某种规则下匹配情况（比如字段名相同，或者字段和类型相同，或者注解的内容相同）
//将一个模型中的数据读取处理， 存储到另一个模型中。
//用 get方法读，再用 set方法 写。