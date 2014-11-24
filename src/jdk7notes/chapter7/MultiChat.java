package jdk7notes.chapter7;

/**
 * Created by suse on 11/23/14.
 */
public class MultiChat {
    public static void main(String[] args){
        ClientQueue queue=new ClientQueue();

        queue.addClientListener(new ClientListener() {

                                    @Override
                                    public void clientAdded(ClientEvent event) {
                                        System.out.printf("%s 从 %s 联机%n", event.getName(), event.getIp());
                                    }

                                    @Override
                                    public void clientRemoved(ClientEvent event) {
                                        System.out.printf("%s 从 %s 脱机%n", event.getName(), event.getIp());

                                    }
                                }


        );

        Client C1=new Client("127.0.0.1", "Caterpillar");
        Client C2=new Client("192.168.1.2","Julia");

        queue.add(C1);
        queue.add(C2);
        queue.remove(C1);
        queue.remove(C2);


        /* following code just for another testing

        final int[] arrs={10,20};
        Object o=new Object(){
            public String toString(){
                return "example: "+arrs[0];
            }
        };

        */

    }
}
