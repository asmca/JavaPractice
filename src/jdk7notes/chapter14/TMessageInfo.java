package jdk7notes.chapter14;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * file in jdk7notes.chapter14
 * Created by suse on 15-1-25.
 */
public class TMessageInfo {

    private DataSource dataSource;

    public TMessageInfo(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public List<ColumnInfo> getAllColumnInfo(){
        List<ColumnInfo> infos = null;
        try (Connection conn = dataSource.getConnection()){
            DatabaseMetaData meta = conn.getMetaData();

            ResultSet crs = meta.getColumns("test", null, "t_message", null);
            infos = new ArrayList<>();

            while (crs.next()){
                ColumnInfo info = new ColumnInfo();
                info.setName(crs.getString("COLUMN_NAME"));
                info.setType(crs.getString("TYPE_NAME"));
                info.setSize(crs.getInt("COLUMN_SIZE"));
                info.setNullable(crs.getBoolean("IS_NULLABLE"));
                info.setDef(crs.getString("COLUMN_DEF"));
                infos.add(info);

            }

        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }
        return infos;
    }

}
