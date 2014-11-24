package jdk7notes.chapter7;

/**
 * Created by suse on 11/23/14.
 */
public class Main {
    public static void main(String[] args){
        //System.out.println(some.x);
//        //Some s=new SomeImpl();
//        AbstractSome s=new AbstractSome()
//        {
//          public void doSome(){
//              System.out.println("做一些事");
//          }
//        };

        Some s=new Some(){
              public void doSome(){
                System.out.println("做一些事");
            }
            public void doService(){
                System.out.println("做一些服务");
            }

        };

        s.doSome();
    }
}
