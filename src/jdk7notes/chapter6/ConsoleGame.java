package jdk7notes.chapter6;

import java.util.Scanner;

/**
 * Created by suse on 11/25/14.
 */
public class ConsoleGame extends GuessGame {
    private Scanner scanner=new Scanner(System.in);

    @Override
    public void print(String text){
        System.out.print(text);
    }

    @Override
    public void println(String text){
        System.out.println(text);
    }

    @Override
    public int nextInt(){
        return scanner.nextInt();
    }
}
