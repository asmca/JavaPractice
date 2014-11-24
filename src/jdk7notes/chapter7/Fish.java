package jdk7notes.chapter7;

/**
 * Created by suse on 14-11-21.
 */
public abstract class Fish implements Swimmer {
    protected  String name;

    public Fish(String name){
        this.name=name;

    }

    public String getName(){
        return name;
    }

    @Override
    public abstract void swim();
}
