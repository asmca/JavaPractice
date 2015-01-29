package jdk7notes.chapter12;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by suse on 1/28/15.
 */
public class ConsoleFileVisitor extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

        printSpace(dir);
        System.out.printf("[%s]%n", dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        printSpace(file);
        System.out.printf("%s%n", file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.err.println(exc);
        return FileVisitResult.CONTINUE;
    }

    private void printSpace(Path path){
        System.out.printf("%"+ path.getNameCount()*2 + "s", "" );

    }
}
