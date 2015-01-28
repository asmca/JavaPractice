package jdk7notes.chapter12;

import java.util.Calendar;
import java.util.*;

/**
 * Created by suse on 1/28/15.
 */
public class CalendarDemo2 {
    public static void main(String[] args) {

        Calendar rightNow = Calendar.getInstance();

        System.out.println("现在的时间是: ");

        System.out.printf("%s%d 年  ", rightNow.getDisplayName(Calendar.ERA, Calendar.LONG, Locale.CHINESE),
                rightNow.get(Calendar.YEAR));

        System.out.print(rightNow.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.CHINESE));

        System.out.printf("%d日 ",
                rightNow.get(Calendar.DAY_OF_MONTH)
                );

        System.out.println(rightNow.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.CHINESE));
    }

}
