package jdk7notes.chapter7;

/**
 * Created by suse on 11/23/14.
 */
public class ClientEvent {
    private Client client;

    public ClientEvent(Client client){
        this.client=client;
    }

    public String getName(){
        return client.name;
    }


    public String getIp(){
        return client.ip;
    }
}
