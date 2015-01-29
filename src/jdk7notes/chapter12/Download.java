package jdk7notes.chapter12;

import java.io.IOException;
import java.net.URL;
import java.nio.file.*;


/**
 * Created by suse on 1/28/15.
 */
public class Download {
    public static void main(String[] args) throws IOException{

        URL url = new URL("http://www.td.com/document/PDF/economics/comment/USConsumerConfidence_Jan2015.pdf");
        Files.copy(url.openStream(), Paths.get("/tmp/a.pdf"),StandardCopyOption.REPLACE_EXISTING);
    }
}
