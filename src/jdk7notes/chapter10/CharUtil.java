package jdk7notes.chapter10;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * file in jdk7notes.chapter10
 * Created by suse on 14-12-28.
 */
public class CharUtil {
    public static void dump(Reader src, Writer dest) throws IOException {
        try (Reader input = src; Writer output = dest) {

            char[] data = new char[1024];
            int length = -1;
            while ((length = input.read(data)) != -1) {
                output.write(data, 0, length);
            }
        }
    }
}