package jdk7notes.chapter11.Concurrency;

import java.util.concurrent.BlockingQueue;

/**
 * file in jdk7notes.chapter11.Concurrency
 * Created by suse on 15-1-18.
 */
public class Producer3 implements Runnable {
    private BlockingQueue<Integer> queue;

    public Producer3(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("生产者开始生产整数...");
        for (int product = 1; product <= 10; product++) {
            try {
                Thread.sleep((int)(Math.random() *3000));
                queue.put(product);
                System.out.printf("生产者提供整数: %d ...%n", product);
            }catch (InterruptedException ex){
                throw new RuntimeException();
            }
        }
    }
}
