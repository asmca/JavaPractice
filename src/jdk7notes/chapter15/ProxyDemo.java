package jdk7notes.chapter15;

/**
 * Created by suse on 1/28/15.
 */
public class ProxyDemo {

    public static void main(String[] args) {
        LoggingHandler loggingHandler = new LoggingHandler();
        Hello helloProxy = (Hello) loggingHandler.bind(new HelloSpeaker());

        helloProxy.hello("ORACLE");
    }
}
