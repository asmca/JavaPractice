package jdk7notes.chapter11;

/**
 * file in jdk7notes.chapter11
 * Created by suse on 15-1-5.
 */
public class Hare implements Runnable {
    private boolean[] flags = {true, false};

    private int totalStep;
    private int step;

    public Hare(int totalStep) {
        this.totalStep = totalStep;
    }

    @Override
    public void run() {
        try {
            while (step< totalStep){
                Thread.sleep(1000);
                boolean isHareSleep = flags[((int) (Math.random()*10))%2];

                if (isHareSleep){
                    System.out.println("兔子睡着了 zzzz");
                }else{
                    step+=2;
                    System.out.printf("兔子跑了 %d步 ...%n", step);
                }
            }
        }catch (InterruptedException ex){
            throw new RuntimeException(ex);
        }
    }
}
