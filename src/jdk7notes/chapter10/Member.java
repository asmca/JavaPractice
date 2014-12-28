package jdk7notes.chapter10;

import java.io.*;

/**
 * file in jdk7notes.chapter10
 * Created by suse on 14-12-28.
 */
public class Member {
    private String number;
    private String name;
    private int age;

    public Member(String number, String name, int age) {
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
        try (DataOutputStream output=
                new DataOutputStream(new FileOutputStream(number))) {
            output.writeUTF(number);
            output.writeUTF(name);
            output.writeInt(age);
        } catch (IOException ex){
            throw  new RuntimeException(ex);
        }
    }


    public static Member load(String number){
        Member member = null;
        try(DataInputStream input =  new DataInputStream(new FileInputStream(number))){
            member = new Member(input.readUTF(), input.readUTF(), input.readInt());
        }
        catch (IOException ex){
            throw    new RuntimeException(ex);
        }
        return member;

    }

}
