package jdk7notes.chapter11;

/**
 * file in jdk7notes.chapter11
 * Created by suse on 15-1-11.
 */
public class ThreadGroupDemo2 {
    public static void main(String[] args) {
        ThreadGroup tg1 = new ThreadGroup("tg1");
        Thread t1 = new Thread(tg1, new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException("t1 测试异常");
            }
        });

        t1.setUncaughtExceptionHandler(
                new Thread.UncaughtExceptionHandler(){
                    @Override
                    public void uncaughtException(Thread t, Throwable e) {
                        System.out.printf("%s: %s%n", t.getName(), e.getMessage());
                    }
                }
        );

        Thread t2 = new Thread(tg1, new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException("t2 测试异常"); //we throw this exception and will not catch it.
            }
        });

        t1.start();
        t2.start();
    }
}
