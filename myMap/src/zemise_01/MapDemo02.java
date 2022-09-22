package zemise_01;

import java.util.HashMap;
import java.util.Map;

/*
    Map集合的基本功能：

        V put(K key， V value)：添加元素
        V Remove (Object key)：根据键册除键值对元素
        void clear()：移除所有的键值对元素
        boolean containKey(Object key)：判断集合是否包合指定的键
        boolean containsValue(Object value)：判断集合是否包含指定的值
        boolean isEmpty()：判断集合是否为空
        int size()：集合的长度，也就是集合中键值对的个数
 */
public class MapDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<>();

        //V put(K key， V value)：添加元素
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        //V Remove (Object key)：根据键册除键值对元素
//        System.out.println(map.remove("张无忌"));
//        System.out.println(map.remove("郭襄"));

        //void clear()：移除所有的键值对元素
//        map.clear();

        //boolean containKey(Object key)：判断集合是否包合指定的键
//        System.out.println(map.containsKey("张无忌"));

        //boolean containsValue(Object value)：判断集合是否包含指定的值
//        System.out.println(map.containsValue("小龙女"));

        //boolean isEmpty()：判断集合是否为空
//        System.out.println(map.isEmpty());

        //int size()：集合的长度，也就是集合中键值对的个数
        System.out.println(map.size());

        //输出集合对象
        System.out.println(map);
    }
}
