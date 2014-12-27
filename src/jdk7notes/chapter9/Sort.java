package jdk7notes.chapter9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * file in jdk7notes.chapter9
 * Created by suse on 14-12-28.
 */
public class Sort
{
    public static void main(String[] args) {
        List numbers= Arrays.asList(10,2,3,1,9,15,4);

        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
