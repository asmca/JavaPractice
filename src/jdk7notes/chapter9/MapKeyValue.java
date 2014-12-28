package jdk7notes.chapter9;

import java.util.HashMap;
import java.util.Map;

/**
 * file in jdk7notes.chapter9
 * Created by suse on 14-12-28.
 */
public class MapKeyValue {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("one", "一");
        map.put("two", "二");
        map.put("three", "三");

        System.out.println("显示键");
        foreach(map.keySet());

        System.out.println("显示值");
        foreach(map.values());


    }

    public static void foreach(Iterable<String> iterable){
        for (String element : iterable){
            System.out.println(element);
        }
    }

}
