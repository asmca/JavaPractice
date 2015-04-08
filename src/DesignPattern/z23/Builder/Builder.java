package DesignPattern.z23.Builder;

import DesignPattern.z23.FactoryPattern.MailSender;
import DesignPattern.z23.FactoryPattern.Sender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by suse on 15-4-8.
 */
public class Builder {
    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for (int i =0 ; i<count ; i++){
            list.add(new MailSender());
        }
    }
}
