package jdk7notes.chapter11;

/**
 * file in jdk7notes.chapter11
 * Created by suse on 15-1-10.
 */
public class JoinDemo {
    public static void main(String[] args) {

        System.out.println("Main Thread 开始。。。");
        Thread threadB = new Thread(){
            @Override
            public void run() {
                try {
                    System.out.println("Thread B 开始。。。");
                    for (int i = 0; i < 5; i++) {
                        Thread.sleep(10000);
                        System.out.println("Thread B 执行。。。");
                    }
                    System.out.println("Thread B 结束。。。");
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        };

        threadB.start();

        try {
            threadB.join();
            //threadB.stop();
        }catch (InterruptedException e){
            e.printStackTrace();
        }



        System.out.println("Main thread 将结束 。。。"); // main thread. stops after threadB.

    }

}
