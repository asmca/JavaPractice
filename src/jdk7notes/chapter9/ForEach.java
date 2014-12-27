package jdk7notes.chapter9;

import java.util.*;

/**
 * file in jdk7notes.chapter9
 * Created by suse on 14-12-28.
 */
public class ForEach {
    private static void forEach(Iterable iterable){
        for (Object o :iterable){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List list = Arrays.asList("Justin", "Monica","Irene");
        forEach(list);

        forEach(new HashSet(list));
        forEach(new ArrayDeque(list));
    }
}
