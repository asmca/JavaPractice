package DesignPattern.z23.Facade;

/**
 * Created by suse on 15-4-9.
 */
public class User {

    public static void main(String[] args) {
        Computer com = new Computer();

        com.startup();
        com.stop();
    }


}
