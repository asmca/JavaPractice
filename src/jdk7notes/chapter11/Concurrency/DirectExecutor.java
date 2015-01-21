/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdk7notes.chapter11.Concurrency;

import java.util.concurrent.Executor;

/**
 *
 * @author suse
 */
public class DirectExecutor implements Executor {

    @Override
    public void execute(Runnable command) {
        command.run();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
