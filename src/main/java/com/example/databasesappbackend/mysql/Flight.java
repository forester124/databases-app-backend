package com.example.databasesappbackend.mysql;

import com.example.databasesappbackend.mysql.MyId;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name="arrival_data")
@IdClass(MyId.class)
public class Flight {

    @Id
    @Column(name = "fl_date")
    private Date fl_date;

    @Column(name = "OP_UNIQUE_CARRIER")
    private String op_unique_carrier;

    @Column(name = "OP_CARRIER_FL_NUM")
    private int op_carrier_fl_num;

    @Id
    @Column(name = "ORIGIN")
    private String origin;

    @Id
    @Column(name = "DEST")
    private String dest;

    @Column(name = "DEP_TIME")
    private int dep_time;

    @Column(name = "DEP_DELAY")
    private int dep_delay;

    @Column(name = "TAXI_OUT")
    private int taxi_out;

    @Column(name = "WHEELS_OFF")
    private int wheels_off;

    @Column(name = "WHEELS_ON")
    private int wheels_on;

    @Column(name = "TAXI_IN")
    private int taxi_in;

    @Column(name = "ARR_TIME")
    private int arr_time;

    @Column(name = "ARR_DELAY")
    private int arr_delay;

    @Column(name = "AIR_TIME")
    private int air_time;

    @Column(name = "DISTANCE")
    private int distance;

    public Date getFl_date() {
        return fl_date;
    }

    public void setFl_date(Date fl_date) {
        this.fl_date = fl_date;
    }

    public String getOp_unique_carrier() {
        return op_unique_carrier;
    }

    public void setOp_unique_carrier(String OP_UNIQUE_CARRIER) {
        this.op_unique_carrier = OP_UNIQUE_CARRIER;
    }

    public int getOp_carrier_fl_num() {
        return op_carrier_fl_num;
    }

    public void setOp_carrier_fl_num(int OP_CARRIER_FL_NUM) {
        this.op_carrier_fl_num = OP_CARRIER_FL_NUM;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String ORIGIN) {
        this.origin = ORIGIN;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String DEST) {
        this.dest = DEST;
    }

    public int getDep_time() {
        return dep_time;
    }

    public void setDep_time(int DEP_TIME) {
        this.dep_time = DEP_TIME;
    }

    public int getDep_delay() {
        return dep_delay;
    }

    public void setDep_delay(int DEP_DELAY) {
        this.dep_delay = DEP_DELAY;
    }

    public int getTaxi_out() {
        return taxi_out;
    }

    public void setTaxi_out(int TAXI_OUT) {
        this.taxi_out = TAXI_OUT;
    }

    public int getWheels_off() {
        return wheels_off;
    }

    public void setWheels_off(int WHEELS_OFF) {
        this.wheels_off = WHEELS_OFF;
    }

    public int getWheels_on() {
        return wheels_on;
    }

    public void setWheels_on(int WHEELS_ON) {
        this.wheels_on = WHEELS_ON;
    }

    public int getTaxi_in() {
        return taxi_in;
    }

    public void setTaxi_in(int TAXI_IN) {
        this.taxi_in = TAXI_IN;
    }

    public int getArr_time() {
        return arr_time;
    }

    public void setArr_time(int ARR_TIME) {
        this.arr_time = ARR_TIME;
    }

    public int getArr_delay() {
        return arr_delay;
    }

    public void setArr_delay(int ARR_DELAY) {
        this.arr_delay = ARR_DELAY;
    }

    public int getAir_time() {
        return air_time;
    }

    public void setAir_time(int AIR_TIME) {
        this.air_time = AIR_TIME;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int DISTANCE) {
        this.distance = DISTANCE;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "fl_date=" + fl_date +
                ", op_unique_carrier='" + op_unique_carrier + '\'' +
                ", op_carrier_fl_num=" + op_carrier_fl_num +
                ", origin='" + origin + '\'' +
                ", dest='" + dest + '\'' +
                ", dep_time=" + dep_time +
                ", dep_delay=" + dep_delay +
                ", taxi_out=" + taxi_out +
                ", wheels_off=" + wheels_off +
                ", wheels_on=" + wheels_on +
                ", taxi_in=" + taxi_in +
                ", arr_time=" + arr_time +
                ", arr_delay=" + arr_delay +
                ", air_time=" + air_time +
                ", distance=" + distance +
                '}';
    }
}
