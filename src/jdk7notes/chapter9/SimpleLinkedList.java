package jdk7notes.chapter9;



/**
 * file in jdk7notes.chapter9
 * Created by suse on 14-12-17.
 */
public class SimpleLinkedList {

    private class  Node{
        Node(Object o){
            this.o=o;
        }
        Object o;
        Node next;
    }

    private Node first;

    public void add(Object o){

        if(first==null){
            first=new Node(o);
        }
        else {
            Node last=first;
            while (last.next !=null){
                last= last.next;
            }
            last.next=new Node(o);
        }

    }

    public int size(){
        int count=0;
        Node last=first;
        while(last  !=null){
            count++;
            last=last.next;
        }

        return count;
    }

    public Object get(int index){
        if (index<0||index>=size()){
            throw new IndexOutOfBoundsException(
                    String.format("Index: %d, Size: %d", index, size())
            );
        }
        int count=0;
        Node last=first;
        while(index>count){
            last=last.next;
            count++;
        }

        return last.o;


    }


    public static void main(String[] args) {
        SimpleLinkedList A=new SimpleLinkedList();
        A.add(3);
        //A.add("STR");
        System.out.println(A.size());
        System.out.println(A.get(0));

    }
}

