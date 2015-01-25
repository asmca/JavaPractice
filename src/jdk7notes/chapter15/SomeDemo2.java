package jdk7notes.chapter15;

/**
 * file in jdk7notes.chapter15
 * Created by suse on 15-1-26.
 */

class Some2{
    static {
        System.out.println("执行静态区块!");
    }
}

public class SomeDemo2 {
    public static void main(String[] args) throws ClassNotFoundException{

        Class clz = Class.forName("jdk7notes.chapter15.Some2", false, SomeDemo2.class.getClassLoader());

        System.out.println("已载入 Some2.class");

        Some2 s = null;

        System.out.println("声明 some 参考名称");

        s= new Some2();
        System.out.println("生成 Some 实例");

    }
}
