package jdk7notes.chapter11;

/**
 * file in jdk7notes.chapter11
 * Created by suse on 15-1-12.
 */
public class Producer implements Runnable {
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("生产者开始生产整数....");

        for (int product = 1; product < 10; product++) {
            try {
                Thread.sleep((int)(Math.random() * 3000));
            }catch (InterruptedException ex){
                throw new RuntimeException(ex);
            }
            clerk.setProduct(product);
        }

    }
}
