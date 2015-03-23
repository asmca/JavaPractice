package DesignPattern.z23.FactoryPattern;

/**
 * Created by suse on 15-3-23.
 */
public class FactoryTest3 {

    public static void main(String[] args) {

        Sender sender = SendFactory3.produceMail();
        sender.Send();
    }
}
