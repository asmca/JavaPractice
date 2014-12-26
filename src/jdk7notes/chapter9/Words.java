package jdk7notes.chapter9;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * file in jdk7notes.chapter9
 * Created by suse on 14-12-17.
 */
public class Words {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("请输入: ");
        String line=scanner.nextLine();
        String[] tokens=line.split(" ");
        Set words=new HashSet();

        for(String token: tokens){
            words.add(token);
        }
        //System.out.printf("数组：%s\n", tokens);
        System.out.printf("数组：");
        for(String token: tokens){
            System.out.printf("%s ",token);
        }
        System.out.printf("\n");
        System.out.printf("集合：%s\n", words);


        //This is a dog that is a cat where is the student

    }
}
