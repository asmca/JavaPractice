package DesignPattern.z23.FactoryPattern;

/**
 * Created by suse on 15-3-23.
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("mail");
        sender.Send();
    }
}
