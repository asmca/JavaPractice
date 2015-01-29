package jdk7notes.chapter12;

import java.nio.file.*;
import java.util.Iterator;

/**
 * Created by suse on 1/28/15.
 */
public class Roots {
    public static void main(String[] args) {
        Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
        for (Path name: dirs){
            System.out.println(name);
        }
    }
}
