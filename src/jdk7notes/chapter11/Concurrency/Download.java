/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdk7notes.chapter11.Concurrency;

import java.net.URL;


 
/**
 *
 * @author suse
 */
public class Download {
    public static void main(String[] args) throws Exception{
        URL[] urls = {
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
        
        new Pages(urls, fileNames, new DirectExecutor()).download();
    }
    
}
