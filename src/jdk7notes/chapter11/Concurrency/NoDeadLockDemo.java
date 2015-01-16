package jdk7notes.chapter11.Concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * file in jdk7notes.chapter11.Concurrency
 * Created by suse on 15-1-14.
 */

class Resource{
    private Lock lock = new ReentrantLock();
    private String name;
    private int  resource;

    public Resource(String name, int resource) {
        this.name = name;
        this.resource = resource;
    }

    public String getName() {
        return name;
    }

    public int getResource() {
        return resource;
    }

    int doSome(){
        return ++resource;
    }

    void cooperate(Resource resource1){
        while (true){
            boolean myLock= this.lock.tryLock(); //尝试加锁，如果成功则继续，不成功则轮询。
            boolean resourceLock = resource1.lock.tryLock();

            try {
                if(myLock && resourceLock){
                    resource1.doSome();
                    System.out.printf("%s,%d 整合 %s,%d 的资源 %n", this.name, this.resource, resource1.getName(), resource1.getResource());
                     break;
                }
            }finally {
                if (myLock){
                    this.lock.unlock();
                }
                if(resourceLock){
                    resource1.lock.unlock();
                }
            }

        }
    }

}

public class NoDeadLockDemo {

    public static void main(String[] args) {
        final Resource resource1 = new Resource("resource1", 10);
        final Resource resource2 = new Resource("resource2", 20);

        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    resource1.cooperate(resource2);
                }
            }
        };


        Thread t2 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    resource2.cooperate(resource1);
                }
            }
        };

        t1.start();
        t2.start();
        ; //tt


    }

}
