package jdk7notes.chapter15;

/**
 * file in jdk7notes.chapter15
 * Created by suse on 15-1-25.
 */
public class InfoAbout {
    public static void main(String[] args) {
        try {
            Class clz = Class.forName(args[0]);
            System.out.println("类名称: "+ clz.getName());
            System.out.println("是否为接口: "+ clz.isInterface());
            System.out.println("是否为基本类型: "+ clz.isPrimitive());
            System.out.println("是否为数组: "+ clz.isArray());
            System.out.println("父类名称: "+ clz.getSuperclass().getName());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("没有指定类名称");
        }catch (ClassNotFoundException e){
            System.out.println ("找不到类: "+ args[0]);
        }
    }
}
