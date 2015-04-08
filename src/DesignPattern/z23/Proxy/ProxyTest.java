package DesignPattern.z23.Proxy;

/**
 * Created by suse on 15-4-8.
 */
public class ProxyTest {
    public static void main(String[] args) {

        Sourceable source = new Proxy();

        source.method();

    }
}
