package DesignPattern.z23.Proxy;

/**
 * Created by suse on 15-4-8.
 */
public class Proxy implements  Sourceable {

    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }


    private void before(){
        System.out.println("before method() // proxy");
   }

    private void after(){
        System.out.println("after method() // proxy");
    }
}
