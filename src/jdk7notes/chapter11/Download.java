package jdk7notes.chapter11;

import java.net.URL;

import java.io.*;
/**
 * file in jdk7notes.chapter11
 * Created by suse on 15-1-8.
 */
public class Download {
    public static void main(String[] args) throws Exception{
        URL[] urls = {
            new URL("http://openhome.cc/Gossip/Encoding/"),
            new URL("http://openhome.cc/Gossip/Scala/"),
            new URL("http://openhome.cc/Gossip/JavaScript/"),
            new URL("http://openhome.cc/Gossip/Python/")
        };

        String[] fileNames={
                "Encoding.html",
                "Scala.html",
                "JavaScript.html",
                "Python.html"
        };

        for (int i = 0; i < urls.length; i++) {
            dump(urls[i].openStream(), new FileOutputStream(fileNames[i]));
        }
    }

    private static void dump(InputStream src, OutputStream dest) throws IOException{
        try(InputStream input = src; OutputStream output = dest) {
            byte[] data = new byte[1024];
            int length = -1;
            while ((length  = input.read(data)) != -1){
                output.write(data,0, length);
            }
        }
    }
}
