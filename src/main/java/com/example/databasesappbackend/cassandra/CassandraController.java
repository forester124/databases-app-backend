package com.example.databasesappbackend.cassandra;


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
public class CassandraController {

    @Autowired
    private FlightRepositoryCass service;

    @GetMapping("/cass")
    public String homePage(Model model) {
        List<FlightCass> flightList = service.findAll();
        model.addAttribute("flightList", flightList);
        return "index";
    }

    @GetMapping("/cass/new")
    public String showNewFlightForm(Model model) {
        model.addAttribute("flight", new FlightCass());
        return "newForm";
    }

    @GetMapping("/cass/edit/{date}&{dest}&{origin}")
    public String showEditForm(Model model, @PathVariable("date") Date date,
                               @PathVariable("dest") String dest, @PathVariable("origin") String origin) {
        FlightKey id = new FlightKey(dest, origin, date);
        System.out.println(id);
        FlightCass flight = service.findFlightByFlightKey(id);
        model.addAttribute("flight", flight);
        return "newForm";
    }

    @PostMapping("/cass/save")
    public String addFlight(FlightCass flight) {
        service.save(flight);
        return "redirect:/cass";
    }

    @DeleteMapping("/cass/delete/{date}&{dest}&{origin}")
    public String delete(@PathVariable("date") Date date, @PathVariable("dest") String dest, @PathVariable("origin") String origin) {
        FlightKey id = new FlightKey(dest, origin, date);
        FlightCass flight = service.findFlightByFlightKey(id);
        service.delete(flight);
        return "index";
    }
}
