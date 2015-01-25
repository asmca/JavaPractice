package jdk7notes.chapter15;

/**
 * file in jdk7notes.chapter15
 * Created by suse on 15-1-25.
 */
public class Some {
    static {
        System.out.println(Some.class);

    }

    public static void main(String[] args) {
        Some s = null;
        s = new Some();
    }


}
