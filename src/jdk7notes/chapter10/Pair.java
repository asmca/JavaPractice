package jdk7notes.chapter10;

/**
 * file in jdk7notes.chapter10
 * Created by suse on 14-12-28.
 */

/**
  Demo is from http://zzy1943.iteye.com/blog/634418
 **/

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Pair implements Serializable{

    private static final long serialVersionUID = -1874850715617681161L;
    private int type;
    private transient String name;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Pair(int type, String name) {
        super();
        this.type = type;
        this.name = name;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //serialize object pair
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        Pair pair = new Pair(1, "charlie");
        oos.writeObject(pair);
        //deserialize object, get new object newpair
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Pair newpair = (Pair) ois.readObject();

        System.out.println(newpair.getType()+":"+newpair.getName());
    }
}
