package DesignPattern.z23.Bridge;

/**
 * Created by suse on 15-4-9.
 */
public class MyBridge  extends  Bridge{

    public void  method(){
        getSource().method();
    }

}
