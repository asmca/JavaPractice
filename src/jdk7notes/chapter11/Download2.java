package jdk7notes.chapter11;

import java.net.URL;

import java.io.*;
/**
 * file in jdk7notes.chapter11
 * Created by suse on 15-1-8.
 */
public class Download2 {
    public static void main(String[] args) throws Exception{
        final URL[] urls = {
                new URL("http://openhome.cc/Gossip/Encoding/"),
                new URL("http://openhome.cc/Gossip/Scala/"),
                new URL("http://openhome.cc/Gossip/JavaScript/"),
                new URL("http://openhome.cc/Gossip/Python/")
        };
       
        final String[] fileNames={
                "Encoding.html",
                "Scala.html",
                "JavaScript.html",
                "Python.html"
        };
//
//        for (int i = 0; i < urls.length; i++) {
//            dump(urls[i].openStream(), new FileOutputStream(fileNames[i]));
//        }

        for (int i = 0; i < urls.length; i++) {
            final int index = i;
            new Thread() {
                @Override
                public void run() {
                    try {
                        dump(urls[index].openStream(), new FileOutputStream(fileNames[index]));
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }

            }.start();
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
