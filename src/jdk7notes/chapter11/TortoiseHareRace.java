package jdk7notes.chapter11;

/**
 * file in jdk7notes.chapter11
 * Created by suse on 14-12-30.
 */
public class TortoiseHareRace {
    public static void main(String[] args) throws InterruptedException {
        boolean[] flags ={true,false};

        int totalStep=10;
        int tortoiseStep=0;
        int hareStep=0;

        while(tortoiseStep<totalStep && hareStep < totalStep){
            Thread.sleep(1000);
            tortoiseStep++; //1 step.
            System.out.printf("乌龟走了%d步 ..%n", tortoiseStep);

            boolean isHareSleep = flags[((int)(Math.random()*10)) %2 ];
            if(isHareSleep){
                System.out.println("兔子睡着了 ...");
            }else   {
                hareStep+=2;
                System.out.printf("兔子走了%d步 ..%n", hareStep);
            }
        }

    }
}
