package jdk7notes.chapter11.Concurrency;

import java.util.concurrent.BlockingQueue;

/**
 * file in jdk7notes.chapter11.Concurrency
 * Created by suse on 15-1-18.
 */
public class Customer3  implements Runnable{
    private BlockingQueue<Integer> queue;

    public Customer3(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("消费者开始消耗整数...");
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep((int)(Math.random() * 3000));
                int product = queue.take();
                System.out.printf("消费者得到整数: %d...%n", product );
            }catch (InterruptedException ex){
                throw new RuntimeException(ex);
            }
        }
    }
}
