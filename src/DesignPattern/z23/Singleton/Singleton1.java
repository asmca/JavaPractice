package DesignPattern.z23.Singleton;

/**
 * Created by suse on 15-3-24.
 */
public class Singleton1 {
    private  static  Singleton1 instance = null;

    private  Singleton1(){

    }

    public static Singleton1 getInstance(){
        if (instance ==null)
        {
            instance = new Singleton1();
        }
        return instance;
    }

    public  Object readResolve(){
        return instance;
    }

}
