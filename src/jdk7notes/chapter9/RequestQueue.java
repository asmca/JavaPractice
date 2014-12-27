package jdk7notes.chapter9;

import java.util.LinkedList;
import java.util.Queue;

/**
 * file in jdk7notes.chapter9
 * Created by suse on 14-12-27.
 */

interface Request{
    void execute();
}

public class RequestQueue {
    public static void main(String[] args) {
        Queue requests =new LinkedList();
        for (int i = 0; i < 6; i++) {
            requests.offer(new Request() {
                @Override
                public void execute() {
                    System.out.printf("处理数据 %f%n", Math.random());
                }
            });
        }

        process(requests);

    }


    private static void process(Queue requests){
        while(requests.peek() !=null){
            Request request =(Request) requests.poll();
            request.execute();
        }
    }



}
