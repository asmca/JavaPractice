package jdk7notes.chapter9;

/**
 * file in jdk7notes.chapter9
 * Created by suse on 14-12-26.
 */

import java.util.HashSet;
import java.util.Set;


class Student2 {
    private String name;
    private String number;


    public Student2(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s)", name, number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student2 student2 = (Student2) o;

        if (name != null ? !name.equals(student2.name) : student2.name != null) return false;
        if (number != null ? !number.equals(student2.number) : student2.number != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }
}


public class Students2 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(new Student2("Justin", "B835031"));
        set.add(new Student2("Monica", "B835032"));
        set.add(new Student2("Justin", "B835031"));

        System.out.println(set);
    }
}

