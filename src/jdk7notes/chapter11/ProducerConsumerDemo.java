package jdk7notes.chapter11;

/**
 * file in jdk7notes.chapter11
 * Created by suse on 15-1-12.
 */
public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        new Thread( new Producer(clerk)).start();
        new Thread(new Consumer(clerk)).start();
    }
}
