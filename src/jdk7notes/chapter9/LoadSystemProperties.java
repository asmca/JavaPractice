package jdk7notes.chapter9;

import java.util.Properties;

/**
 * file in jdk7notes.chapter9
 * Created by suse on 14-12-28.
 */
public class LoadSystemProperties {
    public static void main(String[] args) {
        Properties props= System.getProperties();
        System.out.println(props.getProperty("username"));
        System.out.println(props.getProperty("password"));
        System.out.println(props.getProperty("java.version"));
    }
}


//  # /usr/lib/java/bin/java  -Dusername=suse -Dpassword=issue