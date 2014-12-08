package jdk7notes.chapter8;

/**
 * file in jdk7notes.chapter8
 * Created by suse on 12/9/14.
 */
public class FileUtil_Test {
    public static int test(boolean flag){
        try {
            if (flag) {
                return 1;
            }
        }finally{
                System.out.println("finally...");
            }
            return 0;
        }

    public static void main(String[] args){
        System.out.println(test(true));
    }

}
