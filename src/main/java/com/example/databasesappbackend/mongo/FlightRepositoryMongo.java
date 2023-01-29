package com.example.databasesappbackend.mongo;

import com.example.databasesappbackend.mysql.Flight;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FlightRepositoryMongo extends MongoRepository<Flight, FlightKeyMondo> {
}
