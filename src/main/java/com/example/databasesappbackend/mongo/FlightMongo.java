package com.example.databasesappbackend.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;


@Document(collection = "test")
public class FlightMongo {
    @Id
    private FlightKeyMongo id;

    //@Column(name = "fl_date")
    private Date fl_date;

    //@Column(name = "OP_UNIQUE_CARRIER")
    private String op_unique_carrier;

   // @Column(name = "OP_CARRIER_FL_NUM")
    private int op_carrier_fl_num;

   // @Column(name = "ORIGIN")
    private String origin;

   // @Column(name = "DEST")
    private String dest;

  //  @Column(name = "DEP_TIME")
    private int dep_time;

   // @Column(name = "DEP_DELAY")
    private int dep_delay;

  //  @Column(name = "TAXI_OUT")
    private int taxi_out;

 //   @Column(name = "WHEELS_OFF")
    private int wheels_off;

  //  @Column(name = "WHEELS_ON")
    private int wheels_on;

  //  @Column(name = "TAXI_IN")
    private int taxi_in;

  //  @Column(name = "ARR_TIME")
    private int arr_time;

  //  @Column(name = "ARR_DELAY")
    private int arr_delay;

  //  @Column(name = "AIR_TIME")
    private int air_time;

  //  @Column(name = "DISTANCE")
    private int distance;

    public FlightKeyMongo getId() {
        return id;
    }

    public void setId(FlightKeyMongo id) {
        this.id = id;
    }

    public Date getFl_date() {
        return fl_date;
    }

    public void setFl_date(Date fl_date) {
        this.fl_date = fl_date;
    }

    public String getOp_unique_carrier() {
        return op_unique_carrier;
    }

    public void setOp_unique_carrier(String op_unique_carrier) {
        this.op_unique_carrier = op_unique_carrier;
    }

    public int getOp_carrier_fl_num() {
        return op_carrier_fl_num;
    }

    public void setOp_carrier_fl_num(int op_carrier_fl_num) {
        this.op_carrier_fl_num = op_carrier_fl_num;
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

    public int getDep_time() {
        return dep_time;
    }

    public void setDep_time(int dep_time) {
        this.dep_time = dep_time;
    }

    public int getDep_delay() {
        return dep_delay;
    }

    public void setDep_delay(int dep_delay) {
        this.dep_delay = dep_delay;
    }

    public int getTaxi_out() {
        return taxi_out;
    }

    public void setTaxi_out(int taxi_out) {
        this.taxi_out = taxi_out;
    }

    public int getWheels_off() {
        return wheels_off;
    }

    public void setWheels_off(int wheels_off) {
        this.wheels_off = wheels_off;
    }

    public int getWheels_on() {
        return wheels_on;
    }

    public void setWheels_on(int wheels_on) {
        this.wheels_on = wheels_on;
    }

    public int getTaxi_in() {
        return taxi_in;
    }

    public void setTaxi_in(int taxi_in) {
        this.taxi_in = taxi_in;
    }

    public int getArr_time() {
        return arr_time;
    }

    public void setArr_time(int arr_time) {
        this.arr_time = arr_time;
    }

    public int getArr_delay() {
        return arr_delay;
    }

    public void setArr_delay(int arr_delay) {
        this.arr_delay = arr_delay;
    }

    public int getAir_time() {
        return air_time;
    }

    public void setAir_time(int air_time) {
        this.air_time = air_time;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public FlightMongo() {

    }
}
