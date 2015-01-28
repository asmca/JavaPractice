package jdk7notes.chapter15;

import java.util.logging.*;


public class HelloProxy implements Hello {

    private Hello helloObj;

    public HelloProxy(Hello helloObj) {
        this.helloObj = helloObj;
    }

    @Override
    public void hello(String name) {
        log("hello()方法开始...");
        helloObj.hello(name);
        log("hello()方法结束...");
    }

    private void log(String msg){

        Logger.getLogger(HelloProxy.class.getName()).log(Level.INFO, msg);
    }

    public static void main(String[] args) {
        Hello proxy = new HelloProxy(new HelloSpeaker());
        proxy.hello("suse");
    }
}
