package DesignPattern.z23.AbstractFactory;

/**
 * Created by suse on 15-3-23.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
