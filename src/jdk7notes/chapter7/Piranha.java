
package jdk7notes.chapter7;

/**
 * Created by suse on 14-11-21.
 */
public class Piranha extends Fish {
    public Piranha(String name){
        super(name);
    }

    @Override
    public void swim(){
        System.out.printf("食人鱼 %s 游泳%n", name);
    }
}
