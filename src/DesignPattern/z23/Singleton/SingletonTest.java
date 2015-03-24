package DesignPattern.z23.Singleton;

/**
 * Created by suse on 15-3-24.
 */
public class SingletonTest {
    private static SingletonTest instance = null;

    private SingletonTest(){

    }


    private static synchronized  void syncInit(){
        if (instance ==null){
            instance = new SingletonTest();
        }
    }

    public static SingletonTest getInstance(){
        if (instance == null){
            syncInit();
        }
        return instance;
    }

}
