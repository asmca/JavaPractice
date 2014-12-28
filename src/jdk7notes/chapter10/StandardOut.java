package jdk7notes.chapter10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * file in jdk7notes.chapter10
 * Created by suse on 14-12-28.
 */
public class StandardOut {
    public static void main(String[] args) throws IOException {
        try (PrintStream printStream = new PrintStream(
                new FileOutputStream(args[0])
        )){
            System.setOut(printStream);
            System.out.println("Hello World");
        }
    }
}
