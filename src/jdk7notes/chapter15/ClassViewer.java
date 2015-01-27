package jdk7notes.chapter15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by suse on 1/27/15.
 */
public class ClassViewer {

    public static void view(String clzName) throws  ClassNotFoundException {
        Class clz   = Class.forName(clzName);
        Package p = clz.getPackage(); // fetch package info./object.

        System.out.printf("Package %s;%n", p.getName());

        int modifier = clz.getModifiers();

        System.out.printf("%s %s %s {%n",
                Modifier.toString(modifier),
                Modifier.isInterface(modifier)? "interface" :"class",
                clz.getName()

        );

        Field[] fields = clz.getDeclaredFields();

        for (Field field : fields){
            System.out.printf("\t %s %s %s; %n",
                    Modifier.toString(field.getModifiers()),
                    field.getType().getName(),
                    field.getName()
                    );
        }


        Constructor[] constructors =  clz.getDeclaredConstructors();

        for (Constructor constructor : constructors){
            System.out.printf("\t %s %s(); %n",
                    Modifier.toString(constructor.getModifiers()),
                    constructor.getName());
        }


        Method[] methods = clz.getDeclaredMethods();

        for (Method method : methods){
            System.out.printf("\t %s %s %s(); %n",
                    Modifier.toString(method.getModifiers()),
                    method.getReturnType().getName(),
                    method.getName());
        }

        System.out.println("}");

    }

    public static void main(String[] args) {
        try {
            ClassViewer.view(args[0]);
        }catch ( ArrayIndexOutOfBoundsException ex){
            System.out.println("没有指定类");
        }catch (ClassNotFoundException ex){
            System.out.printf("找不到这个类: %s%n", args[0]);
        }
    }


}
