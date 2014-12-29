package jdk7notes.chapter10;

import java.io.*;

/**
 * file in jdk7notes.chapter10
 * Created by suse on 14-12-28.
 */
public class CharUtil2 {
    public static void dump(Reader src, Writer dest) throws Exception{
        try(Reader input = src; Writer output =dest){
            char[] data = new char[1024];
            int length =-1;
            while((length = input.read(data)) != -1){
                output.write(data, 0 , length);
            }
        }
    }

    public static void dump(InputStream src, OutputStream dest, String charset) throws Exception{
        dump(
              new InputStreamReader(src, charset),
                new OutputStreamWriter(dest, charset)
        );
    }

    public static void dump(InputStream src,  OutputStream dest) throws  Exception{
        dump (src, dest, System.getProperty("file.encoding") );

    }
    public static void main(String[] args) {
        /* System.out.println(System.getProperty("file.encoding")); */

        try {
            dump(
              new FileInputStream("/tmp/new "),
              new FileOutputStream("/tmp/new2"),
                    "UTF-8"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
