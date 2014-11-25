package jdk7notes.chapter6;

/**
 * Created by suse on 11/25/14.
 */
abstract class  Some3{
    abstract void doService();
}

class Other3 extends Some3{
    @Override
    void doService(){
    System.out.println("Do other things");
    }
}

public class Main3 {
    public static void main(String[] args){
        Some3 some3=new Other3();
        some3.doService();

    }
}
