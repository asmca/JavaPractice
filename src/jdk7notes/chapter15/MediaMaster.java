package jdk7notes.chapter15;

import java.util.Scanner;

/**
 * Created by suse on 1/27/15.
 */
public class MediaMaster {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException,  IllegalAccessException{

       String playerImpl = System.getProperty("jdk7notes.chapter15.PlayerImpl");

//        String playerImpl = "jdk7notes.chapter15.ConsolePlayer";


        Player player = (Player) Class.forName(playerImpl).newInstance();

        Scanner scanner = new Scanner(System.in);
        System.out.print("输入想要播放的影片: ");

        player.play(scanner.nextLine());

    }
}
