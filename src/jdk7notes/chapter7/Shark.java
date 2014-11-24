package jdk7notes.chapter7;

/**
 * Created by suse on 14-11-21.
 */
public class Shark extends Fish {
    public Shark(String name){
        super(name);
    }

    @Override
    public void swim(){
        System.out.printf("鲨鱼 %s 游泳%n", name);
    }

}
