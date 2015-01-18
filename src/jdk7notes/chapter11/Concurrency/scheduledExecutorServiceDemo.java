package jdk7notes.chapter11.Concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * file in jdk7notes.chapter11.Concurrency
 * Created by suse on 15-1-18.
 */
public class scheduledExecutorServiceDemo {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        //service.scheduleWithFixedDelay(
        service.scheduleAtFixedRate(

                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(new java.util.Date());
                        try {
                            //Thread.sleep(2000);
                            Thread.sleep(500);
                        }catch (InterruptedException ex){
                            throw new   RuntimeException(ex);
                        }
                    }
                }, 2000, 1000, TimeUnit.MILLISECONDS);


    }
}
