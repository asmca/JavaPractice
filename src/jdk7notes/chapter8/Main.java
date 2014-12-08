package jdk7notes.chapter8;

/**
 * file in jdk7notes.chapter8
 * Created by suse on 12/5/14.
 */
public class Main {

    public static String a(){
        String text=null;
        return text.toString();
    }

    public static void b(){
        a();
    }
    public static void c(){
        b();
    }

    public static void main(String[] args){
        try{
            c();
        }catch (NullPointerException ex){
            ex.printStackTrace();
        }
    }

}
