package jdk7notes.chapter12;

import java.util.Calendar;
import java.util.Locale;

/**
 * Created by suse on 1/28/15.
 */
public class GetYear {
    public static void main(String[] args) {

        Calendar rightNow = Calendar.getInstance(Locale.CHINA);

        System.out.println(rightNow.get(Calendar.YEAR));
    }
}
