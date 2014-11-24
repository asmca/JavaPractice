package jdk7notes.chapter7;

/**
 * Created by suse on 11/23/14.
 */
public class Game {
    public static void play(Action action){
        switch (action) {
            case STOP:
                System.out.println("停止播放动画");
                break;
            case  DOWN:
                System.out.println("播放向下动画");
                break;
            case  LEFT:
                System.out.println("播放向左动画");
                break;
            case  RIGHT:
                System.out.println("播放向右动画");
                break;
            case  UP:
                System.out.println("播放向上动画");
                break;
            default:
                System.out.println("不支持的动作");

        }

    }

    public static void main(String[] args){
        play(Action.STOP);
        play(Action.UP);

    }

}
