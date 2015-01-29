package jdk7notes.chapter16;


import java.lang.reflect.*;
import java.util.*;

import java.util.logging.Logger;



public class BeanUtil {
    public static Object getBeans(Map<String, Object> data, String clzName) throws Exception{

        Class clz = Class.forName(clzName);
        Object bean =  clz.newInstance();

        for (String key: data.keySet()   ){

            String setter = String.format("set%s%s", key.substring(0,1).toUpperCase(), key.substring(1));

            Object value = data.get(key);

            try {
                Method method  = clz.getMethod(setter, value.getClass());

                if(Modifier.isPublic(method.getModifiers())){
                    method.invoke(bean, value);
                }
            }catch (NoSuchMethodException ex){
                Logger.getLogger(BeanUtil.class.getName()).warning(String.format("没有 %s 方法 ", setter));
            }


        }
        return bean;

    }
}
