package jdk7notes.chapter8;

/**
 * file in jdk7notes.chapter8
 * Created by suse on 12/9/14.
 */

class Resource implements AutoCloseable{
    void doSome(){
        System.out.println("Do Something");
    }
    @Override
    public void close(){
        System.out.println("Close Resource");
    }
}

public class AutoCloseable1 {
    public static void main(String[] args){
        try(Resource res=new Resource()){
            res.doSome();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
