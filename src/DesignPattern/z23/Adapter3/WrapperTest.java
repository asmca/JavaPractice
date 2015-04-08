package DesignPattern.z23.Adapter3;

/**
 * Created by suse on 15-4-8.
 */
public class WrapperTest {
    public static void main(String[] args) {
        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();

        source1.method1();
        source1.method2();

        System.out.println("separate");

        source2.method1();
        source2.method2();

    }
}
