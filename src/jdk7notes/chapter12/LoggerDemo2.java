package jdk7notes.chapter12;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by suse on 1/28/15.
 */
public class LoggerDemo2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LoggerDemo2.class.getName());

        logger.setLevel(Level.FINE);
        for (Handler handler : logger.getParent().getHandlers()){
            handler.setLevel(Level.FINE);
        }

        logger.log(Level.WARNING, "WARNING 信息");
        logger.log(Level.INFO, "INFO 信息");
        logger.log(Level.CONFIG, "CONFIG 信息");
        logger.log(Level.FINE, "FINE 信息");
    }
}
