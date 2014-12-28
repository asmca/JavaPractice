package jdk7notes.chapter9;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * file in jdk7notes.chapter9
 * Created by suse on 14-12-28.
 */
public class LoadProperties {
    public static void main(String[] args)  {
        Properties props= new Properties();

        try {
             //props.load(new FileInputStream(args[0]));
             props.load(new FileInputStream("src/jdk7notes/chapter9/person.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(props.getProperty("jdk7notes.chapter9.username"));
        System.out.println(props.getProperty("jdk7notes.chapter9.password"));
    }
}
