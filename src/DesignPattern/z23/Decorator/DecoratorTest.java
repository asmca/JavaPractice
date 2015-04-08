package DesignPattern.z23.Decorator;

/**
 * Created by suse on 15-4-8.
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);

        obj.method();
    }
}
