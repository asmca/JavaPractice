package jdk7notes.chapter9;

/**
 * file in jdk7notes.chapter9
 * Created by suse on 14-12-15.
 */

import java.util.*;

public class Guest {
    public static void main(String[] args) {
        List list=new ArrayList();

        Scanner scanner=new Scanner(System.in);
        String name;

        while (true ){
            System.out.println("访客名称: ");
            name=scanner.nextLine();
            if(name.equals("quit")){
                break;
            }
            list.add(name);
        }

        System.out.println("访客名称 列表: ");
        foreach(list);
    }

    public static void foreach(List list){
        for (Object s:list){
            System.out.println(s.toString().toUpperCase());

        }

    }


}
