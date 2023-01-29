package com.example.databasesappbackend.mysql;

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

    public Flight save(Flight flight) {
        return repo.save(flight);
    }

    public Flight getById(MyId id) {
        return repo.getById(id.getFl_date(), id.getOrigin(), id.getDest());
    }

    public void delete(Flight flight) {
        repo.delete(flight);
    }

}
