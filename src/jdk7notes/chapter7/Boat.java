package jdk7notes.chapter7;

/**
 * Created by suse on 11/22/14.
 */
public class Boat implements Swimmer {
    protected String name;

    public Boat(String name){
        this.name=name;
    }

    @Override
    public void  swim(){
        System.out.printf("船 %s 在水面航行%n",name);
    }
}
