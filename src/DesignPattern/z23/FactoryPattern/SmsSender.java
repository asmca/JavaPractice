package DesignPattern.z23.FactoryPattern;

/**
 * Created by suse on 15-3-23.
 */
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("This is smssender");
    }
}
