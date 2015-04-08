package DesignPattern.z23.Adapter;


/**
 * Created by suse on 15-4-8.
 */
public class Wrapper implements  Targetable{

    private   Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();

    }

    @Override
    public void method2() {
        System.out.println("This is the targetable method2 from Wrapper.");

    }
}
