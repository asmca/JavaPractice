package DesignPattern.z23.Adapter;

/**
 * Created by suse on 15-4-8.
 */
public class AdapterTest2 {
    public static void main(String[] args) {
        Source source = new Source();
        Targetable target  = new Wrapper(source);

        target.method1();
        target.method2();
    }
}
