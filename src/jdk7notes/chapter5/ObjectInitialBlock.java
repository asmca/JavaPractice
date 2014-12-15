package jdk7notes.chapter5;

/**
 * file in jdk7notes.chapter5
 * Created by suse on 14-12-10.
 */
class Other{
    {
        System.out.println("对象初始化区块");
    }

     Other() {
         System.out.println("Other() 构造𤋕了发了?发?发  ");
     }

    Other(int o){
        System.out.println("Other(int了?发?发??");
    }
}
  class ObjectInitialBlock {
      public static void main(String[] args) {
          new Other(1);
      }
  }

