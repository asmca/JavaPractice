package jdk7notes.chapter7;
/**
 * Created by suse on 11/23/14.
 */
public interface ClientListener {
    void clientAdded(ClientEvent event);
    void clientRemoved(ClientEvent event);
}
