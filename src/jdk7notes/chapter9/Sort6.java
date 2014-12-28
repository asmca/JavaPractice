package jdk7notes.chapter9;

import java.util.Arrays;

import java.util.Comparator;
import java.util.List;

import java.util.Collections;

/**
 * file in jdk7notes.chapter9
 * Created by suse on 14-12-28.
 */


  class StringComparator2 implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
//        String str1= (String ) o1;
//        String str2= (String ) o2;
        return -s1.compareTo(s2);
    }
}

public class Sort6 {
    public static void main(String[] args) {
        List list =  Arrays.asList("B", "X", "A", "C", "CZ","DX","W");

        Collections.sort(list, new StringComparator2());
        System.out.println(list);
    }
}
