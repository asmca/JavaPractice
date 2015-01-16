/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdk7notes.chapter11.Concurrency;

import java.util.concurrent.locks.*;

/**
 *
 * @author suse
 */
public class Clerk {
    private int product = -1;
    private Lock lock = new ReentrantLock();
    private  Condition condition = lock.newCondition();
    
    public void setProduct(int product){
        try {
            lock.lock( );
            while (this.product != -1) {
                try {
                    condition.await();
                } catch (InterruptedException  ex) {
                    throw new RuntimeException(ex);
                }
            }
            this.product = product;
            System.out.printf("生产者设定 (%d) %n", this.product);
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
    
    public int setProduct(){
        try {
            lock.lock();
            while (this.product == -1) {
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    throw  new RuntimeException(e);
                }
            }
        
            int p = this.product;
            System.out.printf("消费者取走 (%d) %n", this.product);
            this.product = -1;
            condition.signal();
            return p;
        }
        finally {
            lock.unlock(); // this steps will run anyway after return.
        }
    }
    
}
