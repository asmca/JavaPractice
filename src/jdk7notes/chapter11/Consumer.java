package jdk7notes.chapter11;

/**
 * file in jdk7notes.chapter11
 * Created by suse on 15-1-12.
 */
public class Consumer implements Runnable {
    private  Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("消费者开始消耗整数....");

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep((int)(Math.random()*3000));
            }catch (InterruptedException ex){
                throw new RuntimeException(ex);
            }
            int product = clerk.getProduct();
        }
    }
}
