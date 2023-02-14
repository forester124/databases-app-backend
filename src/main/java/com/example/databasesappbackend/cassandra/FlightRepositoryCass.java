//package com.example.databasesappbackend.cassandra;
//
//
//import org.springframework.data.cassandra.repository.AllowFiltering;
//import org.springframework.data.cassandra.repository.CassandraRepository;
//
//import java.util.UUID;
//
//public interface FlightRepositoryCass extends CassandraRepository<FlightCass, FlightKey> {
//    @AllowFiltering
//    FlightCass findFlightByFlightKey(FlightKey key);
//
//}
