package DesignPattern.z23.Facade;

/**
 * Created by suse on 15-4-9.
 */
public class Computer {


    private  CPU cpu;
    private Disk disk;
    private Memory memory;


    public Computer() {
        cpu= new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    public void startup(){

        System.out.println("Computer Startup");

        cpu.startup();
        memory.startup();
        disk.startup();

        System.out.println("Computer Startup finished!");
    }


    public void stop(){
        System.out.println("Computer Shutdown");

        cpu.stop();
        memory.stop();
        disk.stop();

        System.out.println("Computer Shutdown finished!");
    }



}
