package jdk7notes.chapter11;

/**
 * file in jdk7notes.chapter11
 * Created by suse on 15-1-6.
 */
public class DaemonDemo {

    public static void main(String[] args) {
        Thread thread = new Thread(){
            public void run(){
                while(true){
                    System.out.println("Orz");
                }
            }
        };

        //thread.setDaemon(true);
         thread.run();
    }

}
