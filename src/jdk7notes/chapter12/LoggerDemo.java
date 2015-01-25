package jdk7notes.chapter12;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * file in jdk7notes.chapter12
 * Created by suse on 15-1-25.
 */
public class LoggerDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger( LoggerDemo.class.getName());

        logger.log(Level.WARNING, "WARNING 信息");

        logger.log(Level.INFO, "INFO 信息");
        logger.log(Level.CONFIG, "CONFIG 信息");
        logger.log(Level.FINE, "FINE 信息");
    }
}
