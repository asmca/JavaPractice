package jdk7notes.chapter6;

import java.util.Random;

class Value {
    int i;

    public Value(int i) {
        this.i = i;
    }
}

public class FinalData {
    private static Random rand = new Random();

    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    private final int i4 = rand.nextInt(20);

    static final int i5 = rand.nextInt(20);

    public String toString() {
        return id + ":" + "i4=" + i4 + ", i5=" + i5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        System.out.println(fd1);
        System.out.println("Creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }
}