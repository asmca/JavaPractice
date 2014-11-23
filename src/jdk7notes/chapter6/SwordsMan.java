package jdk7notes.chapter6;

/**
 * Created by suse on 11/23/14.
 */
public class SwordsMan {
    private String name;
    private int level;
    private int blood;

    public void fight(){
        System.out.println("挥剑攻击");
    }

    public int getBlood(){
        return blood;
    }

    public void setBlood(int blood){
        this.blood=blood;
    }

}
