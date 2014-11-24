package jdk7notes.chapter7;

/**
 * Created by suse on 14-11-22.
 */
public class Human  {
    private String name;

    public Human(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    /*
     @Override
    public void swim(){
        System.out.printf("人类 %s 游泳 %n",name);
    }
    */
}
