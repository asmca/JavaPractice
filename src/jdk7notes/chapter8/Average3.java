package jdk7notes.chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * file in jdk7notes.chapter8
 * Created by suse on 12/4/14.
 */
public class Average3 {

    public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);

            double sum = 0;
            int count = 0;
            int number;

            while (true) {
                try {
                number = scanner.nextInt();
                if (number == 0) {
                    break;
                }
                sum += number;
                count++;
                }catch (InputMismatchException e){
                    System.out.printf("请输入整数, %s%n", scanner.next());
                }
            }
            System.out.printf("平均 %.2f%n", sum / count);

    }
}
