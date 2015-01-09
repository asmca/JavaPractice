package jdk7notes.chapter11;

/**
 * file in jdk7notes.chapter11
 * Created by suse on 15-1-5.
 */
//public class Tortoise implements Runnable {
public class Tortoise extends Thread {
    private boolean flags[]={true, false};
    private int totalStep;
    private int step;

    public Tortoise(int totalStep) {
        this.totalStep = totalStep;
    }

    @Override
    public void run() {
        try {
            while(step< totalStep) {
                Thread.sleep(1000);
                step++;
                System.out.printf("乌龟走了%d步 ...%n",step);

            }
        }
        catch (InterruptedException ex){
            throw  new RuntimeException(ex);
        }
    }
}
