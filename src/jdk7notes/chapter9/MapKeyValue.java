package jdk7notes.chapter9;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * file in jdk7notes.chapter9
 * Created by suse on 14-12-28.
 */
public class MapKeyValue {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("one", "一");
        map.put("two", "二");
        map.put("three", "三");
//
//        System.out.println("显示键");
//        foreach(map.keySet());
//
//        System.out.println("显示值");
//        foreach(map.values());
        foreach(map.entrySet());


    }

    public static void foreach(Iterable<Map.Entry<String,String>> iterable){
        for (Map.Entry<String,String> element : iterable){
            System.out.printf("(键 %s, 值 %s )", element.getKey(), element.getValue());
        }
    }

}
