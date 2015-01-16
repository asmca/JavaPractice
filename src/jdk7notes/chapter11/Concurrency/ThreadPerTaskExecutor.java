package jdk7notes.chapter11.Concurrency;

import java.util.concurrent.Executor;

/**
 * file in jdk7notes.chapter11.Concurrency
 * Created by suse on 15-1-16.
 */
public class ThreadPerTaskExecutor implements Executor{
    public void  execute(Runnable r){
        new Thread(r).start();
    }
}
