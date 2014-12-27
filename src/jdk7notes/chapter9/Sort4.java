package jdk7notes.chapter9;

import java.util.Arrays;

import java.util.List;

import java.util.Collections;

/**
 * file in jdk7notes.chapter9
 * Created by suse on 14-12-28.
 */
public class Sort4 {
    public static void main(String[] args) {
        List list =  Arrays.asList("B", "X", "A", "C", "CZ","DX","W");

        Collections.sort(list);
        System.out.println(list);
    }
}
