package jdk7notes.chapter11;

import jdk7notes.chapter6.ArrayList;

/**
 * file in jdk7notes.chapter11
 * Created by suse on 15-1-12.
 *
 * race condition of Thread t1/t2.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        final ArrayList list = new ArrayList();
        Thread t1 = new Thread(){
            public void run(){
                while (true){
                    list.add(1);
                }
            }
        };

        Thread t2= new Thread(){
            public void run(){
                while(true){
                    list.add(2);
                }
            }

        };

        t1.start();
        t2.start();
    }
}

//
//Exception in thread "Thread-0" Exception in thread "Thread-1" java.lang.ArrayIndexOutOfBoundsException: 39
//        at jdk7notes.chapter6.ArrayList.add(ArrayList.java:25)
//        at jdk7notes.chapter11.ArrayListDemo$1.run(ArrayListDemo.java:15)
//        java.lang.ArrayIndexOutOfBoundsException: 39
//        at jdk7notes.chapter6.ArrayList.add(ArrayList.java:25)
//        at jdk7notes.chapter11.ArrayListDemo$2.run(ArrayListDemo.java:23)
