package jdk7notes.chapter7;

/**
 * Created by suse on 14-11-22.
 */
public class Seaplane  extends Airplane implements   Swimmer {


    public Seaplane(String name){
        super(name);
    }

    @Override
    public void fly(){
        System.out.printf("海上");
        super.fly();
    }

    @Override
    public void swim(){
        System.out.printf("海上飞机 %s 海面航行%n",getName());
    }

}
