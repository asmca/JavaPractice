package jdk7notes.chapter15;

/**
 * Created by suse on 1/28/15.
 */
public class ClassLoaderHierarchy {
    public static void main(String[] args) {
        Some some = new Some();

        Class clz = some.getClass();
        ClassLoader loader = clz.getClassLoader();

        System.out.println(loader);

        System.out.println(loader.getParent());
        System.out.println(loader.getParent().getParent());
    }
}

//        class jdk7notes.chapter15.Some
//        sun.misc.Launcher$AppClassLoader@1540e19d
//        sun.misc.Launcher$ExtClassLoader@4b67cf4d
//        null

// Same answer on IBM jdk.