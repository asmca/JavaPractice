package jdk7notes.chapter12;

import java.util.ResourceBundle;

/**
 * Created by suse on 1/28/15.
 */
public class Hello {
    public static void main(String[] args) {

        ResourceBundle res = ResourceBundle.getBundle("messages");
        System.out.print(res.getString("jdk7notes.chapter12.welcome") + "!");
        System.out.println(res.getString("jdk7notes.chapter12.name") + "!");
    }
}