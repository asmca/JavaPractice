package jdk7notes.chapter11.Concurrency;

import java.util.*;
import java.io.IOException;
import java.nio.file.*;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

/**
 * file in jdk7notes.chapter11.Concurrency
 * Created by suse on 15-1-18.
 */

class SubDir  extends RecursiveAction{
    Path path;
    String pattern;

    public SubDir(Path path, String pattern) {
        this.path = path;
        this.pattern = pattern;
    }

    @Override
    public void compute() {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)){
            List<SubDir>  subDirs = new java.util.ArrayList<>();
            for (Path subPath : stream){
                if(Files.isDirectory(subPath)){
                    subDirs.add(new SubDir(subPath, pattern));
                }else if(subPath.toString().endsWith(pattern));
            }
            ForkJoinTask.invokeAll(subDirs);
        }catch (IOException | DirectoryIteratorException ex){
            // ignore.
        }
    }
}

public class DirForkJoin {
    public static void main(String[] args) {
        ForkJoinPool mainPool = new ForkJoinPool();

        SubDir subDir = new SubDir(Paths.get(args[0]), args[1]);

        mainPool.invoke(subDir);
    }
}
