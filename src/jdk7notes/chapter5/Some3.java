package jdk7notes.chapter5;

/**
 * file in jdk7notes.chapter5
 * Created by suse on 14-12-15.
 */
public class Some3 {
    public int x;

    public Some3(int x) {
        x = x;
    }

    public static void main(String[] args) {
        Some3 s=new Some3(3);
        System.out.println(s.x);
    }
}
