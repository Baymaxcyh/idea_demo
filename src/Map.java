
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Map {
    public static void main(String[] args) {
        /*以key大小排列*/
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(3,"3");
        map.put(4,"3");
        map.put(13,"3");
        map.put(30,"3");
        map.put(15,"3");
        map.put(1,"3");
        map.put(2,"3");

        map.put(4,"1");
        map.put(13,"1");

        System.out.println(map);

        String str = map.remove(4);
        System.out.println("remove - "+str);

        String str2 = map.get(1);
        System.out.println("get - "+str2);

        int a = map.firstKey();
        int b = map.lastKey();
        System.out.println(a);
        System.out.println(b);

        /*获取单个节点，比目标点 高 或者 低*/
        Entry<Integer, String> entry1 = map.floorEntry(4);
        System.out.println(entry1);
        Entry<Integer, String> entry2 = map.ceilingEntry(4);
        System.out.println(entry2);

        /*获取区间， 比目标点高 或 低*/
        SortedMap<Integer, String> sortedMap1 = map.headMap(4);
        System.out.println(sortedMap1);
        SortedMap<Integer, String> sortedMap2 = map.tailMap(4);
        System.out.println(sortedMap2);
        SortedMap<Integer, String> sortedMap3 = map.subMap(2,16);
        System.out.println(sortedMap3);
    }
}

class Stuinfo {
    private Integer id;
    private String username;
    private String idcard;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getIdcard() {
        return idcard;
    }

    public Integer getAge() {
        return age;
    }
}