//package com.example.databasesappbackend.mongo;
//
//import java.util.Date;
//import java.util.Objects;
//
//public class FlightKeyMongo {
//
//    private String dest;
//    private String origin;
//    private Date fl_date;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        FlightKeyMongo that = (FlightKeyMongo) o;
//        return dest.equals(that.dest) && origin.equals(that.origin) && fl_date.equals(that.fl_date);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(dest, origin, fl_date);
//    }
//
//    public FlightKeyMongo(String dest, String origin, Date fl_date) {
//        this.dest = dest;
//        this.origin = origin;
//        this.fl_date = fl_date;
//    }
//}
