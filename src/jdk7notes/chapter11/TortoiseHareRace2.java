package jdk7notes.chapter11;

/**
 * file in jdk7notes.chapter11
 * Created by suse on 15-1-5.
 */
public class TortoiseHareRace2 {
    public static void main(String[] args) {

        Tortoise tortoise= new Tortoise(10);
        Hare hare = new Hare(10);

        Thread tortoiseThread = new Thread(tortoise);
        Thread hareThread = new Thread(hare);

        tortoiseThread.start();
        hareThread.start();

    }
}
