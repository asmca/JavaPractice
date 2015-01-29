package jdk7notes.chapter12;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by suse on 1/28/15.
 */
public class Dirs {
    public static void main(String[] args) throws IOException{

        try (DirectoryStream<Path> stream =
                     Files.newDirectoryStream(Paths.get("/"))){
            List<String> files = new ArrayList<>();
            for (Path path: stream){
                if (Files.isDirectory(path)){
                    System.out.printf("[%s]%n", path.getFileName());
                }
                else{
                    files.add(path.getFileName().toString());
                }
            }

            for(String file: files){
                System.out.println(file);
            }

        }
    }
}
