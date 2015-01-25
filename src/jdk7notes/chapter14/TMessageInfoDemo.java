package jdk7notes.chapter14;


import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;

 import java.io.IOException;

/**
 * file in jdk7notes.chapter14
 * Created by suse on 15-1-25.
 */
public class TMessageInfoDemo {
    public static void main(String[] args) throws IOException,  ClassNotFoundException {

        MysqlConnectionPoolDataSource ds =new MysqlConnectionPoolDataSource();

        ds.setUrl("jdbc:mysql://localhost:3306/test");
        ds.setUser("root");
        ds.setPassword("");


        TMessageInfo tMessageInfo = new TMessageInfo(ds);



        for (ColumnInfo columnInfo: tMessageInfo.getAllColumnInfo()){
            System.out.printf("%s\t%s\t%s\t%s%n",
                    columnInfo.getName(),
                    columnInfo.getType(),
                    columnInfo.isNullable(),
                    columnInfo.getDef());
        }

    }
}
