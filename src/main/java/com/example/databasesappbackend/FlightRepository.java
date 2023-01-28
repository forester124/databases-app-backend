package com.example.databasesappbackend;

import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface FlightRepository extends CrudRepository<Flight, MyId> {
}
