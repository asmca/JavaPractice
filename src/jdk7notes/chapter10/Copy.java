
package jdk7notes.chapter10;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * file in jdk7notes.chapter10
 * Created by suse on 14-12-28.
 */
public class Copy {
    public static void main(String[] args) {
        try {
            IO.dump(
                    new FileInputStream(args[0]),
                    new FileOutputStream(args[1])
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
