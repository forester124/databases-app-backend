package com.example.databasesappbackend.mysql;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface FlightRepository extends CrudRepository<Flight, MyId> {

    @Query("SELECT f from Flight f where f.fl_date= :date and f.origin= :origin and f.dest= :dest")
    Flight getById(@Param("date") Date date, @Param("origin") String origin, @Param("dest") String dest);


}
