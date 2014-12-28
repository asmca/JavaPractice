package jdk7notes.chapter9;

import java.util.Arrays;

/**
 * file in jdk7notes.chapter9
 * Created by suse on 14-12-28.
 */
public class ArrayList<E> {
    private Object[] list;
    private int next;

    public ArrayList(int capacity) {
        list= new Object[capacity];
    }

    public ArrayList() {
        this(16);
    }

    public void add(E e){
        if (next == list.length){
            list= Arrays.copyOf(list, list.length * 2);
        }
        list[next++] = e;
    }

    public E get(int index){
        return (E) list[index];
    }

    public int size()
    {
        return next;
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "list=" + Arrays.toString(list) +
                ", next=" + next +
                '}';
    }

    public static void main(String[] args) {
        //ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("suse");
        arrayList.add("Jack");
        arrayList.add("Now");
        //arrayList.add(new Integer(20));
        System.out.println(arrayList);
    }


}
