package jdk7notes.chapter15;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by suse on 1/28/15.
 */
public class e5_TestLoader {
    public static void main(String[] args) throws ClassNotFoundException, MalformedURLException {
        Class clz1 = String.class;

        URL url = new URL("file:/tmp/11111/");
        ClassLoader loader =  new URLClassLoader(new URL[] {url});

        Class clz2 = loader.loadClass("java.lang.String");

        System.out.printf("clz1 和 clz2 为 %s 实例", clz1 ==clz2 ? "相同 " : "不同");
    }
}
