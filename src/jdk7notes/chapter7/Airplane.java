package jdk7notes.chapter7;
/**
 * Created by suse on 11/22/14.
 */
public class Airplane implements Flyer {
    private String name;
    public  Airplane(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void fly(){
        System.out.printf("飞机 %s 在飞%n",name);
    }
}
