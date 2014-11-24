package jdk7notes.chapter7;

/**
 * Created by suse on 14-11-22.
 */
public class FlyingFish extends Fish implements Flyer {
    public FlyingFish(String name){
        super(name);
    }

    @Override
    public void swim(){
        System.out.println("飞鱼游泳");

    }

    @Override
    public void fly(){
        System.out.println("飞鱼会飞");
    }
}
