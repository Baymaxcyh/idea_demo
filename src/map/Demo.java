package map;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
/**
 * @author Hiro
 */
public class Demo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(1000);
//		创建hashmap实例
        HashMap<String, String> map =new HashMap<String, String>(1<<6);

//		crud

        String  str1 = map.put("123","123");
        String  str2 = map.put("123","234");
        String  str3 = map.put("123","456");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(map.entrySet());

//		ctrl+/
//		ctrl+shift+/		追加注释
//		boolean boo1 = map.remove("123", "123");
//		String str4 = map.remove("123");
//		System.out.println(boo1);
//		System.out.println(str4);

        String str5 = map.get("123");
        System.out.println(str5);

//		遍历
//		jdk1.8-	map不支持遍历

//		map 自身是处理大数据量的优秀解决方案，但自身不具备遍历接口特性。
//		解决遍历接口特性，把map 接入到collection接口下。
//		使用map的对象实例，封装成set接口。

//		set是个 贴牌商品


        Set<String> set1 = map.keySet();
        Set<Entry<String, String>>  entrys = map.entrySet();
        Collection<String> collection = map.values();

//		在set中获取迭代器
        Iterator<String> it1 = set1.iterator();
//		循环 判断hasNext 是否有下一条数据
        while(it1.hasNext()) {
//			next 获取下一条数据内容
            String str = it1.next();
//			用迭代器删除map中的数据。
            if(str == null) {
                it1.remove();
            }
        }
//		增强for循环  就是迭代器。
        for (String str : set1) {
            System.out.println(str);
        }

//		JDK1.8
        map.forEach((key,value)->{
            System.out.println("key="+key);
            System.out.println("value="+value);
        });
        list.forEach(element ->{
            System.out.println("element"+element);
        });

    }
}

