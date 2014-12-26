package jdk7notes.chapter9;


import java.util.HashSet;
import java.util.Set;

/**
 * file in jdk7notes.chapter9
 * Created by suse on 14-12-26.
 */
class Student {
    private String name;
    private String number;

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString(){
        return String.format("(%s, %s)", name, number);
    }

}


public class Students{
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add(new Student("Justin", "B835031"));
        set.add(new Student("Monica", "B835032"));
        set.add(new Student("Justin", "B835031"));

        System.out.println(set);
    }
}
