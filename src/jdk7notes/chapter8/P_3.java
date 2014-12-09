package jdk7notes.chapter8;

/**
 * file in jdk7notes.chapter8
 * Created by suse on 14-12-9.
 */
public class P_3 {
    public static void main(String[] args) {
        try {
            int number=Integer.parseInt(args[0]);
            System.out.println(number++);
        }catch (NumberFormatException ex){
            System.out.println("必须输入数字");
        }
    }
}
