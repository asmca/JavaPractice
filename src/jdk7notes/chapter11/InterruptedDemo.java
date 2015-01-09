package jdk7notes.chapter11;

/**
 * file in jdk7notes.chapter11
 * Created by suse on 15-1-10.
 */
public class InterruptedDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(99999);

                }catch (InterruptedException ex){
                    System.out.println("我醒了XD");
                }
            }
        };

        thread.start();
        thread.interrupt(); //interrupt.
    }
}
