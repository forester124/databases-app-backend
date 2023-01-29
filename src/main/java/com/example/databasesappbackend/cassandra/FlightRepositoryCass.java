package com.example.databasesappbackend.cassandra;

import com.example.databasesappbackend.Flight;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface FlightRepositoryCass extends CassandraRepository<FlightCass, String> {
    @AllowFiltering
    FlightCass findFlightByFlightKey(FlightKey key);
}
