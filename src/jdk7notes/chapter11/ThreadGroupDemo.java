package jdk7notes.chapter11;

/**
 * file in jdk7notes.chapter11
 * Created by suse on 15-1-11.
 */
public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup tg1= new ThreadGroup("tg1"){
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.printf("%s: %s%n", t.getName(), e.getMessage());
            }
        };

        Thread t1= new Thread(tg1, new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException( "测试异常");
            }
        });

        t1.start();
    }
}
