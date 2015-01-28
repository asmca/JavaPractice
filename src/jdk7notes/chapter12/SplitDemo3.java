package jdk7notes.chapter12;

/**
 * Created by suse on 1/28/15.
 */
public class SplitDemo3 {
    public static void main(String[] args) {
        for (String str: "Justin dog Monica doggie Irene".split("\\bdog\\b")){
            System.out.println(str.trim());
        }
    }
}
