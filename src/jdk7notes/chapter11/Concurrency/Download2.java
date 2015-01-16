package jdk7notes.chapter11.Concurrency;

import java.net.URL;

/**
 * file in jdk7notes.chapter11.Concurrency
 * Created by suse on 15-1-16.
 */
public class Download2 {
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

        new Pages(urls, fileNames, new ThreadPerTaskExecutor()).download();
    }
}
