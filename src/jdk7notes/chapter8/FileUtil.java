package jdk7notes.chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * file in jdk7notes.chapter8
 * Created by suse on 12/5/14.
*/
public class FileUtil {
    public static String readFile(String name) throws FileNotFoundException{
        StringBuilder builder=new StringBuilder();
        try{
            Scanner scanner=new Scanner(new FileInputStream(name));
            while (scanner.hasNext()){
                builder.append(scanner.nextInt());
                builder.append('\n');
            }
        }catch (FileNotFoundException ex ){
            ex.printStackTrace();
            throw ex;
        }
        return builder.toString();
    }
}
