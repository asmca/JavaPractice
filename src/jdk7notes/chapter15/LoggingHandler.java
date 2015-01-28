package jdk7notes.chapter15;

import java.lang.reflect.*;
import java.util.logging.*;

/**
 * Created by suse on 1/28/15.
 */
public class LoggingHandler implements InvocationHandler {
    private Object  target;

    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this
        );
    }


    public Object invoke(Object proxy, Method method,  Object[] args) throws Throwable{

        Object result = null;
        try {
            log(String.format("%s() 调用 开始... ", method.getName()));
            result  = method.invoke(target, args);
            log(String.format("%s() 调用 结束... ", method.getName()));
        }catch (Exception ex){
            log(ex.toString());
        }

        return result;
    }

    private void log(String msg){
        Logger.getLogger(LoggingHandler.class.getName()).log(Level.INFO, msg);
    }



}
