package jdk7notes.chapter12;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;



public class DateFormatDemo {
    public static void main(String[] args) {
        DateFormat dateFormat = null;
        Date date = new Date();

        System.out.println("getDateInstance():");

        dateFormat = DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINA);
        System.out.println(dateFormat.format(date));


        dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.CHINA);
        System.out.println(dateFormat.format(date));


        System.out.println("getTimeInstance():");

        dateFormat = DateFormat.getTimeInstance(DateFormat.LONG, Locale.CHINA);
        System.out.println(dateFormat.format(date));
        dateFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.CHINA);
        System.out.println(dateFormat.format(date));
        dateFormat = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.CHINA);
        System.out.println(dateFormat.format(date));

        System.out.println("getDateTimeInstance():");

        dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.CHINA);
        System.out.println(dateFormat.format(date));
        dateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.CHINA);
        System.out.println(dateFormat.format(date));
        dateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.CHINA);
        System.out.println(dateFormat.format(date));


    }
}
