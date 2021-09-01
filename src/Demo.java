import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Hiro
 */
public class Demo {
    public static void main(String[] args){
        ArrayList list1 = new ArrayList();

        list1.add("abc");
        list1.add("def");

        /*增*/
        list1.add(1,"bbb");
        System.out.println(list1);

        /*删*/
        Object result = list1.remove(1);
        boolean boo = list1.remove("def");

        /*改*/
        list1.set(1,"bbc");

        /*查*/
        list1.contains("321");
//        boolean boo1 = list1.isEmpty();
        System.out.println(list1);

        /*遍历*/
        for (int i = 0,size = list1.size();i < size; i++){
            Object obj = list1.get(i);
        }

        /*增强for  for(每个元素得数据类型 每个元素得别名:要遍历的列表)*/
        for (Object obj : list1){
            System.out.println(obj);
        }
        /*1.8 箭头函数*/
        list1.forEach(ele->{System.out.println(ele);});
        /*1.8 ::函数提取*/
        list1.forEach(System.out::println);


        LinkedList list2 = new LinkedList();
        /*crud*/
        list2.add("abc");
        list2.add(1,"123");

        list2.get(1);
    }
}
