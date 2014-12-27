package jdk7notes.chapter9;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;


/**
 * file in jdk7notes.chapter9
 * Created by suse on 14-12-28.
 */
public class Stack {

    private Deque deque  = new ArrayDeque();
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
    }

    public boolean push(Object o) {
        if(deque.size() +1 >capacity){
            return false;
        }
        return deque.offerLast(o);
    }

    public Object pop(){
        return deque.pollLast();
    }

    public Object peak(){
        return deque.peekLast();
    }

    public int size(){
        return deque.size();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push("Justin");
        stack.push("Jerry");
        stack.push("Irene");
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        for (Object o : stack){
//            System.out.println(o);
//        }

        Iterator iterator = stack.deque.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}



