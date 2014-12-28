package jdk7notes.chapter10;


import java.io.*;

/**
 * file in jdk7notes.chapter10
 * Created by suse on 14-12-28.
 */
public class BufferedIO {
    public static void dump(InputStream src,  OutputStream dest) throws IOException{
        try (InputStream input = new BufferedInputStream(src);
                OutputStream output = new BufferedOutputStream(dest)) {
            byte[] data = new byte[1024];
            int length  =-1;
            while ((length= input.read(data)) != -1){
                output.write(data,0, length);
            }

        }
    }
}
