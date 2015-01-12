package jdk7notes.chapter11;

import sun.text.normalizer.IntTrie;

/**
 * file in jdk7notes.chapter11
 * Created by suse on 15-1-12.
 */
public class Clerk {
    private int product = -1;

    public synchronized  void setProduct(int product){
        while (this.product !=-1){
            try {
                wait();
            }catch (InterruptedException ex){
                throw new  RuntimeException(ex);
            }
        }
        this.product = product;
        System.out.printf("生产者设定 (%d) %n", this.product);
        notify();
    }


    public synchronized int getProduct(){
        while (this.product == -1){
            try {
                wait();
            }catch (InterruptedException ex){
                throw new RuntimeException(ex);
            }
        }

        int p = this.product;
        System.out.printf("消费者取走 (%d)%n", this.product);
        this.product = -1;
        notify();
        return p;
    }

}
