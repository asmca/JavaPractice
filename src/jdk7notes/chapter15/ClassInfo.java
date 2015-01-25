package jdk7notes.chapter15;

/**
 * file in jdk7notes.chapter15
 * Created by suse on 15-1-25.
 */
public class ClassInfo {
    public static void main(String[] args) {
        Class clz = String.class;  // here this Class means java.lang.Class....
        System.out.println("类名称: " + clz.getName());
        System.out.println("是否为接口" + clz.isInterface());
        System.out.println("是否为基本类型"+ clz.isPrimitive());
        System.out.println("是否为数组对象"+ clz.isArray());
        System.out.println("父类名称" + clz.getSuperclass().getName());
    }
}
