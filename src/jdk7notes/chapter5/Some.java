package jdk7notes.chapter5;

/**
 * file in jdk7notes.chapter5
 * Created by suse on 14-12-15.
 */
public class Some {
    private static Some some;
    private Some(){}

    public static Some create(){
        if(some ==null){
            some=new Some();
        }
        return some;
    }

    public static void main(String[] args) {
        Some s = new Some();
    }
}
