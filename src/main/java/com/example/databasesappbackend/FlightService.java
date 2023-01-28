package com.example.databasesappbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class FlightService {
    @Autowired
    private FlightRepository repo;

    public List<Flight> getAll() {
        return (List<Flight>) this.repo.findAll();
    }

    public Flight save(Flight flight) {
        return repo.save(flight);
    }

    public Flight getById(MyId id) {
        Optional<Flight> flight = repo.findById(id);
        Flight f = flight.get();
        return f;
    }

    public void delete(Flight flight) {
        repo.delete(flight);
    }

}
