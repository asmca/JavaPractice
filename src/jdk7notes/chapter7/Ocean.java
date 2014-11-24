package jdk7notes.chapter7;

/**
 * Created by suse on 14-11-22.
 */
public class Ocean {
    public static void doSwim(Swimmer swimmer){
        swimmer.swim();
    }

    public static void main(String[] args){
        doSwim(new Anemonefish("尼莫"));
        doSwim(new Shark("兰尼"));
        //doSwim(new Human("贾斯汀"));
        doSwim(new Submarine("黄色一号"));

        doSwim(new Seaplane("空军0号"));
        doSwim(new FlyingFish("一条小飞鱼"));

        doSwim(new Swimplayer("小孙"));
    }
}

