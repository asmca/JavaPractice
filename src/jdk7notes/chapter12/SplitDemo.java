package jdk7notes.chapter12;

/**
 * Created by suse on 1/28/15.
 */
public class SplitDemo {
    public static void main(String[] args) {

        for (String token: "Justin,Monica,Irene".split(",")){
            System.out.println(token);
        }
        for (String token: "JustinOrzMonicaOrzIrene".split("Orz")){
            System.out.println(token);
        }
        for (String token: "Justin\tMonica\tIrene".split("\t")){
            System.out.println(token);
        }
        for (String token: "Justin||Monica||Irene".split("\\|\\|")){
            System.out.println(token);
        }


    }
}
