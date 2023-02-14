//package com.example.databasesappbackend.mongo;
//
//import com.example.databasesappbackend.cassandra.FlightCass;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class FlightServiceMongo {
//
//    @Autowired
//    private FlightRepositoryMongo repository;
//
//    public List<FlightMongo> getAll() {
//        return (List<FlightMongo>) this.repository.findAll();
//    }
//
//    public FlightMongo save(FlightMongo flight) {
//        return repository.save(flight);
//    }
//
//    public FlightMongo getById(FlightKeyMongo id) {
//        return repository.getFlightByFligthKeyMongo(id);
//    }
//
//    public void delete(FlightMongo flight) {
//        repository.delete(flight);
//    }
//}
