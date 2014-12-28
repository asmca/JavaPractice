package jdk7notes.chapter10;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
 import java.net.URL;

/**
 * file in jdk7notes.chapter10
 * Created by suse on 14-12-28.
 */
public class Download {
    public static void main(String[] args) {
        URL url= null;
        try {
            url = new URL(args[0]);
            InputStream src= url.openStream();
            OutputStream dest= new FileOutputStream(args[1]);
            IO.dump(src,dest);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

    }
}
