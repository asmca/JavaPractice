package jdk7notes.chapter12;

import java.io.IOException;

import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/**
 * Created by suse on 1/28/15.
 */
public class BasicFileAttributesDemo {
    public static void main(String[] args) throws IOException{

        Path file = Paths.get("/tmp/booked.pdf");

        BasicFileAttributes attrs = Files.readAttributes(file, BasicFileAttributes.class);



        System.out.printf("createTime: %s%n", attrs.creationTime());
        System.out.printf("lastAccessTime: %s%n", attrs.lastAccessTime());
        System.out.printf("lastModifiledTime: %s%n", attrs.lastModifiedTime());
        System.out.printf("isDirectory: %b%n", attrs.isDirectory());
        System.out.printf("isOther: %b%n", attrs.isOther());
        System.out.printf("isRegularFile: %b%n", attrs.isRegularFile());
        System.out.printf("isSymbolLink: %b%n", attrs.isSymbolicLink());
        System.out.printf("size: %b%n", attrs.size());



        Files.setLastModifiedTime(file, FileTime.fromMillis(System.currentTimeMillis()));// seems not return sync.
        System.out.printf("lastModifiledTime: %s%n", attrs.lastModifiedTime());




    }
}
