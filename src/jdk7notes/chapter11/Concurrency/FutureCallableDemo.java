package jdk7notes.chapter11.Concurrency;

import java.util.concurrent.*;

/**
 * file in jdk7notes.chapter11.Concurrency
 * Created by suse on 15-1-18.
 */
public class FutureCallableDemo {
    public static long fibonacci(long n){
        if (n<=1){
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }


    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        Future<Long> fib30 =  service.submit(new Callable<Long>() {
            @Override
            public Long call() throws Exception {
                return fibonacci(30);
            }
        });
//        FutureTask<Long> fib30 = new FutureTask<Long>(
//                new Callable<Long>() {
//                    @Override
//                    public Long call() throws Exception {
//                        return fibonacci(30);
//                    }
//                }
//        );

        System.out.println("要第30个Fibonacci#, ...");
        //new Thread(fib30).start();

        System.out.println("Do other things.");

        try {
            Thread.sleep(5000);
            System.out.printf("第30个Fib# 是%d, %n", fib30.get());
        }catch (InterruptedException | ExecutionException ex){
            ex.printStackTrace();
        }

    }

}
