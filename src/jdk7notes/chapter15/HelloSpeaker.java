package jdk7notes.chapter15;

/**
 * Created by suse on 1/28/15.
 */
public class HelloSpeaker implements Hello {
    @Override
    public void hello(String name) {
        System.out.printf("Hello ! %s, %n", name);
    }
}
