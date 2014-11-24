package jdk7notes.chapter7;

/**
 * Created by suse on 11/23/14.
 */
abstract class AbstractSome implements Some   {
    public abstract void doSome();

    public void doService(){
        System.out.println("做一些服务");
    }
}
