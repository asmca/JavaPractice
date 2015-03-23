package DesignPattern.z23.AbstractFactory;

/**
 * Created by suse on 15-3-23.
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
