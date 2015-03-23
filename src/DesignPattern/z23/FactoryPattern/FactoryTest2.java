package DesignPattern.z23.FactoryPattern;

/**
 * Created by suse on 15-3-23.
 */
public class FactoryTest2 {
    public static void main(String[] args) {

        SendFactory2 factory2= new SendFactory2();
        Sender sender = factory2.produceMail();
        sender.Send();
    }
}
