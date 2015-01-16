/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdk7notes.chapter11.Concurrency;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.concurrent.Executor;


/**
 *
 * @author suse
 */
public class Pages {
    private URL[] urls;
    private String[] fileNames;
    private Executor executor;

    public Pages(URL[] urls, String[] fileNames, Executor executor) {
        this.urls = urls;
        this.fileNames = fileNames;
        this.executor = executor;
    }
    
    public void download(){
        for (int i = 0; i < urls.length; i++) {
            final int index = i;
            executor.execute( new Runnable() {

                @Override
                public void run() {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    try {
                        dump(
                        urls[index].openStream(),
                        new FileOutputStream(fileNames[index])
                        );
                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });

            
        }
    }
    
    private void dump(InputStream src, OutputStream dest) throws IOException{
        try(InputStream input= src; OutputStream output=dest) {
            byte[] data= new byte[1024];
            int length = -1;
            while ((length = input.read(data)) != -1) {                
                output.write(data, 0, length);
            }
        }  
        
    }

}
