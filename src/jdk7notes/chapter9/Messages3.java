package jdk7notes.chapter9;

import java.util.*;

/**
 * file in jdk7notes.chapter9
 * Created by suse on 14-12-28.
 */

class StringComparator3 implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}

public class Messages3 {
    public static void main(String[] args) {
        Map<String, String> messages= new TreeMap<>(new StringComparator3());
        messages.put("Justin","给 Justine的信息! ");
        messages.put("Monica", "Hello Monica !");
        messages.put("Irene", "Irene的可爱喵!");

        Scanner scanner = new Scanner(System.in);
        System.out.println ("要取谁的信息: ");

        String message = messages.get(scanner.nextLine());

        System.out.println(message);
        System.out.print(messages);

    }
}
