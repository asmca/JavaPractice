package jdk7notes.chapter5;

/**
 * file in jdk7notes.chapter5
 * Created by suse on 14-12-15.
 */

 class Customer{
    String name;

    public Customer(String name) {
        this.name = name;
    }
}

public class CallByValue {
    public  static void some(Customer c){
        c.name="John";
    }

    public static void other(Customer c){
        c=new Customer("Bill");
    }


    public static void main(String[] args) {
        Customer c1=new Customer("Justin");
        some(c1);
        System.out.println(c1.name);

        Customer c2=new Customer("Justin");
        other(c2);
        System.out.println(c2.name);
    }
}
