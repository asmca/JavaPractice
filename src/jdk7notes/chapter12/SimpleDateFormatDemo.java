package jdk7notes.chapter12;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by suse on 1/28/15.
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat("EE-MM-DD-YYYY", Locale.CHINA);

        System.out.println(dateFormat.format(new Date()));
    }
}
