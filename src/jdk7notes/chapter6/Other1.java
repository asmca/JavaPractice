package jdk7notes.chapter6;

/**
 * Created by suse on 11/25/14.
 */
public class Other1 extends Some1 {
    @Override
    void doService(){
        System.out.println("Other Service");
    }
}

class Main{
    public static void main(String[] args){
        //Other1 other1=new Other1();
        Some1 other1=new Other1();
        other1.doService();
    }
}
