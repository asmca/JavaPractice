package jdk7notes.chapter12;

import java.io.IOException;
import java.nio.file.*;


public class Ls {

    public static void main(String[] args) throws IOException{
        Path path = Paths.get(System.getProperty("user.dir"));

        String glob = "*";
        if(args.length != 0){
            glob = args[0];
        }

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path, glob)){
            for (Path entry : stream){
                System.out.println(entry.getFileName());
            }

        }
    }
}
