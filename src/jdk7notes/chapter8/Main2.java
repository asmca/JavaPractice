package jdk7notes.chapter8;

/**
 * file in jdk7notes.chapter8
 * Created by Suse on 12/5/14.
 */
public class Main2 {


        public static String a(){
            String text=null;
            return text.toString();
        }

        public static void b(){
            a();
        }
        public static void c(){
            try {
                b();
            }catch (NullPointerException ex){
                ex.printStackTrace();
                throw ex;
            }
        }

        public static void main(String[] args){
            try{
                c();
            }catch (NullPointerException ex){
                ex.printStackTrace();
            }
        }

    }


