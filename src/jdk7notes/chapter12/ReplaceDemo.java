package jdk7notes.chapter12;

/**
 * Created by suse on 1/28/15.
 */
public class ReplaceDemo {

    public static void main(String[] args) {
        String[] regexs = {".*foo", ".*?foo", ".*+foo"};

        for (String regex : regexs){
            System.out.println("xfooxxxxxxfoo".replaceAll(regex, "Orz"));
        }
    }
}
