package DesignPattern.z23.Adapter;

/**
 * Created by suse on 15-4-8.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("This is targetable implemented method");
    }
}
