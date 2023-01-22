package com.example.databasesappbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    @Autowired
    private FlightRepository repo;

    public List<Flight> getAll() {
        return (List<Flight>) this.repo.findAll();
    }
}
