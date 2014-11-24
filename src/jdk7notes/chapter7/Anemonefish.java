package jdk7notes.chapter7;
/**
 * Created by suse on 14-11-21.
 */
public class Anemonefish extends Fish {
    public Anemonefish(String name){
        super(name);
    }

    @Override
    public void swim(){

        System.out.printf("小丑鱼 %s 游泳%n", name);
    }

}
