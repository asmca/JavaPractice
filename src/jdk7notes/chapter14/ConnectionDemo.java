package jdk7notes.chapter14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * file in jdk7notes.chapter14
 * Created by suse on 15-1-13.
 */
public class ConnectionDemo {
    public static void main(String[] args)
        throws ClassNotFoundException, SQLException{

        Class.forName("com.mysql.jdbc.Driver");
        String jdbcURL = "jdbc:mysql://localhost:3306/lxr";

        String user = "root";
        String password = "";

        try (Connection conn = DriverManager. getConnection(jdbcURL, user, password)){
            System.out.printf("数据库已经 %s%n", conn.isClosed() ? "关闭" : "打开");
        }
    }
}
