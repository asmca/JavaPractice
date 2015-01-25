package jdk7notes.chapter14;

import java.io.Serializable;

/**
 * file in jdk7notes.chapter14
 * Created by suse on 15-1-25.
 */
public class Message implements Serializable {

    private Long id;
    private String name;
    private String email;
    private String msg;

    public Message() {
    }

    public Message(  String name, String email, String msg) {
        //this.id = id;
        this.name = name;
        this.email = email;
        this.msg = msg;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMsg() {
        return msg;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
