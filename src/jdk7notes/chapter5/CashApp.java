package jdk7notes.chapter5;

import java.util.Scanner;

/**
 * file in jdk7notes.chapter5
 * Created by suse on 14-12-9.
 */
public class CashApp {
    public static void main(String[] args) {
        CashCard[] cards={
                new CashCard("A001",500,0),
                new CashCard("A002",300,0),
                new CashCard("A003",1000,1),
                new CashCard("A004",2000,2),
                new CashCard("A005",3000,3),
        };

        Scanner scanner= new Scanner(System.in);
        for (CashCard card:cards){
            System.out.printf("为(%s, %d, %d) 储值: ", card.getNumber(), card.getBalance(), card.getBonus());
            card.store(scanner.nextInt());
        }
        for (CashCard card:cards){
            System.out.printf("(%s, %d, %d)%n", card.getNumber(), card.getBalance(), card.getBonus());
        }
    }
}
