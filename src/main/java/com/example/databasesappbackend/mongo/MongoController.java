package com.example.databasesappbackend.mongo;

import com.example.databasesappbackend.cassandra.FlightCass;
import com.example.databasesappbackend.cassandra.FlightKey;
import com.example.databasesappbackend.cassandra.FlightRepositoryCass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Date;
import java.util.List;

@Controller
public class MongoController {

    @Autowired
    private FlightServiceMongo service;

    @GetMapping("/mongo")
    public String homePage(Model model) {
        List<FlightMongo> flightList = service.getAll();
        model.addAttribute("flightList", flightList);
        return "index";
    }

    @GetMapping("/mongo/new")
    public String showNewFlightForm(Model model) {
        model.addAttribute("flight", new FlightMongo());
        return "newForm";
    }

    @GetMapping("/mongo/edit/{date}&{dest}&{origin}")
    public String showEditForm(Model model, @PathVariable("date") Date date,
                               @PathVariable("dest") String dest, @PathVariable("origin") String origin) {
        FlightKeyMongo id = new FlightKeyMongo(dest, origin, date);
        FlightMongo flight = service.getById(id);
        model.addAttribute("flight", flight);
        return "newForm";
    }

    @PostMapping("/mongo/save")
    public String addFlight(FlightMongo flight) {
        service.save(flight);
        return "redirect:/mongo";
    }

    @DeleteMapping("/mongo/delete/{date}&{dest}&{origin}")
    public String delete(@PathVariable("date") Date date, @PathVariable("dest") String dest, @PathVariable("origin") String origin) {
        FlightKeyMongo id = new FlightKeyMongo(dest, origin, date);
        FlightMongo flight = service.getById(id);
        service.delete(flight);
        return "index";
    }
}
