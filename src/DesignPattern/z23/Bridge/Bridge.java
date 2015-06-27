package DesignPattern.z23.Bridge;

/**
 * Created by suse on 15-4-9.
 */
public abstract class Bridge {

    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource(){
        return source;
    }

    public void setSource(Sourceable source){
        this.source = source;
    }



}
