package jdk7notes.chapter11.Concurrency;

import java.util.Arrays;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * file in jdk7notes.chapter11.Concurrency
 * Created by suse on 15-1-14.
 */
public class ArrayList2 {
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    private Object[] list;
    private int next;

    public ArrayList2(int capacity){
        list= new Object[capacity];
    }

    public ArrayList2(){
        this(16);
    }

    public void add(Object o ){
        try {
            lock.writeLock().lock();
            if (next == list.length){
                list= Arrays.copyOf(list, list.length*2);
            }
            list[next++]=o;  // we know length is not the leng of list,
                             // actual leng, is next, final index.
        }finally {
            lock.writeLock().unlock();
        }
    }

    public Object  get(int index){
        try {
            lock.readLock().lock();
            return list[index];
        }finally {
            lock.readLock().unlock();
        }
    }

    public int size(){ // list have empty space for arrlist.
        try {
            lock.readLock().lock();
            return next;
        }finally {
            lock.readLock().unlock();
        }
    }
}


