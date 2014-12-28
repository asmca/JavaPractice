package jdk7notes.chapter10;

/**
 * file in jdk7notes.chapter10
 * Created by suse on 14-12-28.
 */
public class Member2Demo {
    public static void main(String[] args) {
        Member[] members = {
                new Member("B1234","Justin",30),
                new Member("B5678","Monica",20),
                new Member("B90","Irene",35)
        };

        for (Member member : members){
            member.save();
        }
        System.out.println(Member.load("B1234"));
        System.out.println(Member.load("B5678"));
        System.out.println(Member.load("B90"));
    }
}
