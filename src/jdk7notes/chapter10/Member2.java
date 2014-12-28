package jdk7notes.chapter10;

import java.io.*;

/**
 * file in jdk7notes.chapter10
 * Created by suse on 14-12-28.
 */
public class Member2 implements Serializable {
    private String number;
    private String name;
    private transient int  age;

    public Member2(String number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void save(){
        try (ObjectOutputStream output=
                     new ObjectOutputStream(new FileOutputStream(number))) {
            output.writeObject(this);
        } catch (IOException ex){
            throw  new RuntimeException(ex);
        }
    }


    public static Member2 load(String number){
        Member2 member = null;
        try(ObjectInputStream input =  new ObjectInputStream(new FileInputStream(number))){
            member =  (Member2) input.readObject();
        }
        catch (IOException | ClassNotFoundException ex ){
            throw    new RuntimeException(ex);
        }
        return member;

    }

}
