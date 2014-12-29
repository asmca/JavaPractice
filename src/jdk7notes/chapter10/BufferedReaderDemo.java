package jdk7notes.chapter10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * file in jdk7notes.chapter10
 * Created by suse on 14-12-28.
 */
public class BufferedReaderDemo {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        String name = null;
        try {
            name = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("Hello, %s", name);
    }
}
