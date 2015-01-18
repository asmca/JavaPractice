package jdk7notes.chapter11.Concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * file in jdk7notes.chapter11.Concurrency
 * Created by suse on 15-1-18.
 */
public class ProducerConsumerDemo3 {
    public static void main(String[] args) {
        BlockingQueue queue = new ArrayBlockingQueue(1);

        new Thread(new Producer3(queue)).start();
        new Thread(new Customer3(queue)).start();
    }
}
