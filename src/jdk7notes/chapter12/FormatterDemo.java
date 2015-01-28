package jdk7notes.chapter12;



import java.util.Date;
import java.util.logging.*;

/**
 * Created by suse on 1/28/15.
 */
public class FormatterDemo {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(FormatterDemo.class.getName());
        logger.setLevel(Level.CONFIG);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.CONFIG);

        handler.setFormatter(new Formatter() {        //log格式控制
            @Override
            public String format(LogRecord record) {
                return "日志来自于\t: " + record.getSourceClassName()+
                        record.getSourceMethodName() +"\n" +
                        "\t 层级 \t: " +record.getLevel() +"\n" +
                        "\t 信息 \t: " +record.getMessage() +"\n" +
                        "\t 时间 \t: " + new Date(record.getMillis());
            }
        });

        logger.addHandler(handler);
        logger.config("自定义 Formatter  信息");
    }
}
