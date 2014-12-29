package jdk7notes.chapter10;

import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;

/**
 * file in jdk7notes.chapter10
 * Created by suse on 14-12-28.
 */
public class CharUtilDemo {
    public static void main(String[] args) {


        try {
            FileReader reader = new FileReader(args[0]);
            StringWriter writer = new StringWriter();
            CharUtil.dump(reader, writer);
            System.out.println(writer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
