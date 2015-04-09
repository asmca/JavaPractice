package DesignPattern.z23.Bridge;

/**
 * Created by suse on 15-4-9.
 */
public class SourceSub1 implements Sourceable {

    @Override
    public void method() {
        System.out.println("This is method from SourceSub1");
    }
}
