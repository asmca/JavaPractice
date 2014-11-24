package jdk7notes.chapter6;

/**
 * Created by suse on 11/23/14.
 */
public class SwordsMan extends Role{

    public void fight(){
        System.out.println("挥剑攻击");
    }


    @Override
    public String toString(){
        return "剑士"+ super.toString();
    }
}
