package DesignPattern.z23.Singleton;

/**
 * Created by suse on 15-3-24.
 */
public class Singleton {
    private  static Singleton instance = null;

    private Singleton(){

    }

    private static class SingletonFactory {
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
            return SingletonFactory.instance;
        }



//
//    public static Singleton getInstance(){
//        if (instance ==null)
//        {
//            synchronized (instance) {
//             if (instance==null){
//                instance = new Singleton();
//             }
//            }
//        }
//        return instance;
//    }

    public  Object readResolve(){
        return instance;
    }

}
