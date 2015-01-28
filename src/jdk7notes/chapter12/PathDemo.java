package jdk7notes.chapter12;

import java.nio.file.*;

/**
 * Created by suse on 1/28/15.
 */
public class PathDemo {
    public static void main(String[] args) {

        Path path = Paths.get(System.getProperty("user.home"),"Downloads");

        System.out.printf("toString: %s\n", path.toString());
        System.out.printf("getFileName: %s%n", path.getFileName());
        System.out.printf("getName(0): %s%n", path.getName(0));
        System.out.printf("getNameCount: %d%n", path.getNameCount());
        System.out.printf("subpath(0,2): %s%n", path.subpath(0,2));
        System.out.printf("getParent: %s%n", path.getParent());
        System.out.printf("getRoot: %s%n",path.getRoot());

        System.out.println("---------------------");

        for (Path p: path){
            System.out.println(p);
        }


    }
}
