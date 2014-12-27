package jdk7notes.chapter9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * file in jdk7notes.chapter9
 * Created by suse on 14-12-28.
 */

class Account implements Comparable{
    private String name;
    private String number;
    private int balance;

    public Account(String name, String number, int balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Account other = (Account) o;
        return this.balance - other.balance;
    }
}

public class Sort2 {
    public static void main(String[] args) {
        List accounts= Arrays.asList(
            new Account("Justin", "X1234",1000),
            new Account("Monica", "X5678",500),
            new Account("Irene", "X6789",200)
        );

        Collections.sort(accounts);
        System.out.println(accounts);
    }
}
