package com.example.databasesappbackend.cassandra;

import com.example.databasesappbackend.mysql.Flight;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface FlightRepositoryCass extends CassandraRepository<Flight, String> {
}
