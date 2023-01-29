package com.example.databasesappbackend.mysql;

import java.io.Serializable;
import java.sql.Date;

public class MyId implements Serializable {
    private Date fl_date;
    private String origin;
    private String dest;

    public MyId() {}

    public MyId(Date fl_date, String origin, String dest) {
        this.fl_date = fl_date;
        this.origin = origin;
        this.dest = dest;
    }

    public Date getFl_date() {
        return fl_date;
    }

    public void setFl_date(Date fl_date) {
        this.fl_date = fl_date;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    @Override
    public String toString() {
        return "MyId{" +
                "fl_date=" + fl_date +
                ", origin='" + origin + '\'' +
                ", dest='" + dest + '\'' +
                '}';
    }
}
