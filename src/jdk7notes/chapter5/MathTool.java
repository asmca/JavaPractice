package jdk7notes.chapter5;

/**
 * file in jdk7notes.chapter5
 * Created by suse on 14-12-15.
 */
public class MathTool {
    public static  int sum(int... numbers){
        int sum=0;
        for (int number:numbers){
            sum +=number;
        }
        return sum;
    }

    public static void main(String[] args) {
        MathTool a =new MathTool();
        int  s=a.sum(1,2,3,4,5);
        System.out.println(s);
    }
}


