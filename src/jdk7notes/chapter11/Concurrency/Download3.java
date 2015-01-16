package jdk7notes.chapter11.Concurrency;

import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * file in jdk7notes.chapter11.Concurrency
 * Created by suse on 15-1-16.
 */
public class Download3 {
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

        //new Pages(urls, fileNames, new ThreadPerTaskExecutor()).download();

        ExecutorService executorService = Executors.newCachedThreadPool();
        new Pages(urls, fileNames, executorService).download();

    }
}
