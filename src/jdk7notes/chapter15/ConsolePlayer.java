package jdk7notes.chapter15;

/**
 * Created by suse on 1/27/15.
 */
public class ConsolePlayer implements Player {
    @Override
    public void play(String video) {
        System.out.println("正在播放 " + video);
    }
}
