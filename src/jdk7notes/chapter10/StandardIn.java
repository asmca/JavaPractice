package jdk7notes.chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * file in jdk7notes.chapter10
 * Created by suse on 14-12-28.
 */
public class StandardIn
{

    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream(args[0]));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try(Scanner scanner = new Scanner(System.in)){
            while ( scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
    }
}
