package com.example.databasesappbackend.mongo;

import java.util.Date;
import java.util.Objects;

public class FlightKeyMondo {

    private String destination;
    private String origin;
    private Date fl_date;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightKeyMondo that = (FlightKeyMondo) o;
        return destination.equals(that.destination) && origin.equals(that.origin) && fl_date.equals(that.fl_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, origin, fl_date);
    }
}
