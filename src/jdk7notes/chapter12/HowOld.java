package jdk7notes.chapter12;

import java.util.*;

import java.text.*;
/**
 * Created by suse on 1/28/15.
 */
public class HowOld {
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);

        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        System.out.print("输入出生年月日:(yyyy-mm-dd): ");

        Date birth = dateFormat.parse(scanner.nextLine());

        Date current = new Date();

        long life = current.getTime()- birth.getTime();

        System.out.print("你今年的岁数: "+ (life/(365*24*60*60*1000L)));
    }
}
