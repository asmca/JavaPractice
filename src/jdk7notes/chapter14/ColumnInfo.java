package jdk7notes.chapter14;

import java.io.Serializable;

/**
 * file in jdk7notes.chapter14
 * Created by suse on 15-1-25.
 */
public class ColumnInfo implements Serializable {
    private String name;
    private String type;
    private int size;
    private boolean nullable;
    private String def;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isNullable() {
        return nullable;
    }

    public void setNullable(boolean nullable) {
        this.nullable = nullable;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }
}
