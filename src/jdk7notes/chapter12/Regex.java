package jdk7notes.chapter12;

import java.util.Scanner;
import java.util.regex.*;



/**
 * Created by suse on 1/28/15.
 */
public class Regex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("输入正则表达式: ");
            Pattern pattern = Pattern.compile(scanner.nextLine());

            System.out.print("输入要比较的文字: ");
            Matcher matcher0 = pattern.matcher(scanner.nextLine());

            boolean isFound = false;

            while (matcher0.find()){
                System.out.printf("从索引 %d 到索引 %d 之间，找到合适的文字  \"%s\"%n",
                        matcher0.start(), matcher0.end(), matcher0.group());
            }

        }catch (PatternSyntaxException ex){
            System.out.println("正则表达式有错误.");

            System.out.println(ex.getMessage());
        }

    }
}
