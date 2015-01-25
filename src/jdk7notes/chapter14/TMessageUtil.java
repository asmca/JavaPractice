package jdk7notes.chapter14;

import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;
import java.io.OutputStream;

/**
 * file in jdk7notes.chapter14
 * Created by suse on 15-1-25.
 */
public class TMessageUtil {
    public static void writeXML(OutputStream outputStream) throws  Exception {
        try (WebRowSet rowSet = RowSetProvider.newFactory().createWebRowSet()){
            rowSet.setUrl("jdbc:mysql://localhost:3306/test");
            rowSet.setUsername("root");
            rowSet.setPassword("");
            rowSet.setCommand("SELECT * FROM t_message");
            rowSet.execute();
            rowSet.writeXml(outputStream);

        }
    }


    public static void main(String[] args)  throws Exception{
        TMessageUtil.writeXML(System.out);
    }
}
