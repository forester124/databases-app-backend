package com.example.databasesappbackend.cassandra;

import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@PrimaryKeyClass
public class FlightKey implements Serializable {

    @PrimaryKeyColumn(name = "DEST")
    private String destination;

    @PrimaryKeyColumn(name = "ORIGIN")
    private String origin;

    @PrimaryKeyColumn(name = "FL_DATE")
    private Date fl_date;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Date getFl_date() {
        return fl_date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightKey flightKey = (FlightKey) o;
        return destination.equals(flightKey.destination) && origin.equals(flightKey.origin) && fl_date.equals(flightKey.fl_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, origin, fl_date);
    }

    public void setFl_date(Date fl_date) {
        this.fl_date = fl_date;
    }
}
