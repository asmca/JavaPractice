package jdk7notes.chapter8;

import java.awt.*;

/**
 * file in jdk7notes.chapter8
 * Created by suse on 12/9/14.
 */

class ResourceSome implements AutoCloseable{
    void doSome(){
        System.out.println("Do Something");
    }
    @Override
    public void close(){
        System.out.println("Close ResourceSome");
    }
}


class ResourceOther implements AutoCloseable{
    void doOther(){
        System.out.println("Do Other things");
    }

    @Override
    public void close(){
        System.out.println("Close ResourceOther");
    }
}

public class AutoCloseable2 {
    public static void main(String[] args){
        try(ResourceSome some=new ResourceSome(); ResourceOther other=new ResourceOther()) {
            some.doSome();
            other.doOther();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

