package DesignPattern.z23.Proxy;

/**
 * Created by suse on 15-4-8.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("This is method() from proxy.Source");
    }
}
