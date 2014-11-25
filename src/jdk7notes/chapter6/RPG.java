package jdk7notes.chapter6;


/**
 * Created by suse on 11/23/14.
 */
public class RPG {
    public static void main(String[] args){
        SwordsMan swordsMan=new SwordsMan();
 
        swordsMan.setName("Justin");
        swordsMan.setLevel(1);
        swordsMan.setBlood(200);

        //System.out.printf("剑士: (%s, %d, %d)%n",swordsMan.getName(), swordsMan.getLevel(), swordsMan.getBlood());

        Magician magician=new Magician();
        magician.setName("Lunar");
        magician.setLevel(2);
        magician.setBlood(98);

//        System.out.printf("魔法师: (%s, %d,%d)%n", magician.getName(), magician.getLevel(), magician.getBlood());

//        System.out.println( swordsMan.toString());
//        System.out.println(  magician.toString());
        System.out.println( swordsMan);
        System.out.println(  magician);


    }
}
