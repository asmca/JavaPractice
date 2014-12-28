package jdk7notes.chapter10;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * file in jdk7notes.chapter10
 * Created by suse on 14-12-28.
 */
public class IO {
    public static void dump(InputStream src, OutputStream dest) throws IOException{

        try(InputStream input=src; OutputStream output= dest) {
            byte[] data =new byte[1024];
            int length = -1;
            while ((length = input.read(data)) != -1){
                output.write(data, 0, length);
            }
        }

    }
}
