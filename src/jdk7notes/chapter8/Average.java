package jdk7notes.chapter8;

import java.util.Scanner;

/**
 * file in ${PACKAGE_NAME}
 * Created by suse on 11/25/14.
 */
public class Average {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        double sum=0;
        int count=0;
        int number;

        while(true){
            number=scanner.nextInt();
            if (number==0){
                break;
            }
            sum+=number;
            count++;
        }
        System.out.printf("平均 %.2f%n", sum/count);
    }
}
