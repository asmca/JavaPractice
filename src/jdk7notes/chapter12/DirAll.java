package jdk7notes.chapter12;

import java.io.IOException;
import java.nio.file.*;

/**
 * Created by suse on 1/28/15.
 */
public class DirAll {
    public static void main(String[] args) throws IOException{

        Files.walkFileTree(Paths.get(args[0]), new ConsoleFileVisitor());  //walkfiletree!!!

        System.out.println();
    }
}
