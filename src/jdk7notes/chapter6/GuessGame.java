package jdk7notes.chapter6;

/**
 * Created by suse on 11/25/14.
 */
public abstract class GuessGame   {
    public void go(){
        int number=(int)(Math.random()*10);
        int guess;
        do{
            print("输入数字: ");
            guess=nextInt();

        }while(guess !=number);
        println("猜中了");
    }

    public abstract void print(String string);
    public abstract void println(String string);
    public abstract int nextInt();
}
