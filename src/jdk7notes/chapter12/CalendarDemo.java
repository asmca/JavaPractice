package jdk7notes.chapter12;

  import java.util.*;

/**
 * Created by suse on 1/28/15.
 */
public class CalendarDemo {
    public static void main(String[] args) {

        Map<Integer, String> days = new HashMap<>();

        days.put(Calendar.MONDAY, "星期一做的事");
        days.put(Calendar.TUESDAY, "星期二做的事");
        days.put(Calendar.WEDNESDAY, "星期三做的事");
        days.put(Calendar.THURSDAY, "星期四做的事");
        days.put(Calendar.FRIDAY, "星期五做的事");
        days.put(Calendar.SATURDAY, "星期六做的事");
        days.put(Calendar.SUNDAY, "星期日做的事");

        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);



        System.out.println(days.get(dayOfWeek));
    }
}
