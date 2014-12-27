package jdk7notes.chapter9;

import java.util.Arrays;

import java.util.Comparator;
import java.util.List;

import java.util.Collections;

/**
 * file in jdk7notes.chapter9
 * Created by suse on 14-12-28.
 */

class StringComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String str1= (String ) o1;
        String str2= (String ) o2;
        return -str1.compareTo(str2);
    }
}

public class Sort4 {
    public static void main(String[] args) {
        List list =  Arrays.asList("B", "X", "A", "C", "CZ","DX","W");

        Collections.sort(list, new StringComparator());
        System.out.println(list);
    }
}
