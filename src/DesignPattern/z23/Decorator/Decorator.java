package DesignPattern.z23.Decorator;

/**
 * Created by suse on 15-4-8.
 */
public class Decorator implements Sourceable {

    private  Sourceable source;

    public Decorator(Sourceable source) {
        super();
        this.source = source;
    }

    @Override
    public void method() {

        System.out.println("Before the Decorator");
        source.method();
        System.out.println("after the Decorator");

    }



}
