package jdk7notes.chapter6;

import java.util.Scanner;

/**
 * Created by suse on 11/25/14.
 */
public class Guess {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int number=(int)(Math.random()*10);
        int guess;
        do {
            System.out.print("请输入数字: ");
            guess=scanner.nextInt();
        }while (guess!=number);

        System.out.println(" 猜中了！ ");
    }
}
