//package com.example.databasesappbackend.cassandra;
//
//import org.springframework.data.cassandra.core.mapping.PrimaryKey;
//import org.springframework.data.cassandra.core.mapping.Table;
//
//import javax.persistence.Column;
//
//import java.sql.Date;
//
//
//@Table(value="arrival_data")
//public class Flight {
//
//    @PrimaryKey
//    private FlightKey pk;
//    @Column(name = "fl_date")
//    private Date fl_date;
//
//    @Column(name = "OP_UNIQUE_CARRIER")
//    private String op_unique_carrier;
//
//    @Column(name = "OP_CARRIER_FL_NUM")
//    private int op_carrier_fl_num;
//
//    public FlightKey getPk() {
//        return pk;
//    }
//
//    public void setPk(FlightKey pk) {
//        this.pk = pk;
//    }
//
//    @Column(name = "ORIGIN")
//    private String origin;
//
//    @Column(name = "DEST")
//    private String dest;
//
//    @Column(name = "DEP_TIME")
//    private int dep_time;
//
//    @Column(name = "DEP_DELAY")
//    private int dep_delay;
//
//    @Column(name = "TAXI_OUT")
//    private int taxi_out;
//
//    @Column(name = "WHEELS_OFF")
//    private int wheels_off;
//
//    @Column(name = "WHEELS_ON")
//    private int wheels_on;
//
//    @Column(name = "TAXI_IN")
//    private int taxi_in;
//
//    @Column(name = "ARR_TIME")
//    private int arr_time;
//
//    @Column(name = "ARR_DELAY")
//    private int arr_delay;
//
//    @Column(name = "AIR_TIME")
//    private int air_time;
//
//    @Column(name = "DISTANCE")
//    private int distance;
//
//    public Date getFl_date() {
//        return fl_date;
//    }
//
//    public void setFl_date(Date fl_date) {
//        this.fl_date = fl_date;
//    }
//
//    public String getOp_unique_carrier() {
//        return op_unique_carrier;
//    }
//
//    public void setOp_unique_carrier(String OP_UNIQUE_CARRIER) {
//        this.op_unique_carrier = OP_UNIQUE_CARRIER;
//    }
//
//    public int getOp_carrier_fl_num() {
//        return op_carrier_fl_num;
//    }
//
//    public void setOp_carrier_fl_num(int OP_CARRIER_FL_NUM) {
//        this.op_carrier_fl_num = OP_CARRIER_FL_NUM;
//    }
//
//    public String getOrigin() {
//        return origin;
//    }
//
//    public void setOrigin(String ORIGIN) {
//        this.origin = ORIGIN;
//    }
//
//    public String getDest() {
//        return dest;
//    }
//
//    public void setDest(String DEST) {
//        this.dest = DEST;
//    }
//
//    public int getDep_time() {
//        return dep_time;
//    }
//
//    public void setDep_time(int DEP_TIME) {
//        this.dep_time = DEP_TIME;
//    }
//
//    public int getDep_delay() {
//        return dep_delay;
//    }
//
//    public void setDep_delay(int DEP_DELAY) {
//        this.dep_delay = DEP_DELAY;
//    }
//
//    public int getTaxi_out() {
//        return taxi_out;
//    }
//
//    public void setTaxi_out(int TAXI_OUT) {
//        this.taxi_out = TAXI_OUT;
//    }
//
//    public int getWheels_off() {
//        return wheels_off;
//    }
//
//    public void setWheels_off(int WHEELS_OFF) {
//        this.wheels_off = WHEELS_OFF;
//    }
//
//    public int getWheels_on() {
//        return wheels_on;
//    }
//
//    public void setWheels_on(int WHEELS_ON) {
//        this.wheels_on = WHEELS_ON;
//    }
//
//    public int getTaxi_in() {
//        return taxi_in;
//    }
//
//    public void setTaxi_in(int TAXI_IN) {
//        this.taxi_in = TAXI_IN;
//    }
//
//    public int getArr_time() {
//        return arr_time;
//    }
//
//    public void setArr_time(int ARR_TIME) {
//        this.arr_time = ARR_TIME;
//    }
//
//    public int getArr_delay() {
//        return arr_delay;
//    }
//
//    public void setArr_delay(int ARR_DELAY) {
//        this.arr_delay = ARR_DELAY;
//    }
//
//    public int getAir_time() {
//        return air_time;
//    }
//
//    public void setAir_time(int AIR_TIME) {
//        this.air_time = AIR_TIME;
//    }
//
//    public int getDistance() {
//        return distance;
//    }
//
//    public void setDistance(int DISTANCE) {
//        this.distance = DISTANCE;
//    }
//}
