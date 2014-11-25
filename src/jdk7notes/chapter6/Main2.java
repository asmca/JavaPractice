package jdk7notes.chapter6;

/**
 * Created by suse on 11/25/14.
 */
 class Some2 {
    int hashcode(){
        return 99;
    }
}

 public class Main2{
    public static void main(String[] args){
        Some2 some2=new Some2();
        System.out.println(some2.hashcode());
        System.out.println(some2);

    }
}
