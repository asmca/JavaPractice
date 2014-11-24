package jdk7notes.chapter7;

/**
 * Created by suse on 14-11-22.
 */
public class Swimplayer extends Human implements Swimmer {
    public Swimplayer(String name){
        super(name);
    }

    @Override
    public void swim(){
        System.out.printf("游泳选手 %s 游泳%n",getName());
    }
}
