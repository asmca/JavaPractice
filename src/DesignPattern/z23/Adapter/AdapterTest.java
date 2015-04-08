package DesignPattern.z23.Adapter;

/**
 * Created by suse on 15-4-8.
 */
public class AdapterTest {
    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
