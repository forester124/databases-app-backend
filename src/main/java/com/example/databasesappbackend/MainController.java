package com.example.databasesappbackend;

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
public class MainController {

    @Autowired
    private FlightService service;

    @GetMapping("")
    public String homePage(Model model) {
        List<Flight> flightList = service.getAll();
        model.addAttribute("flightList", flightList);
        return "index";
    }

    @GetMapping("/new")
    public String showNewFlightForm(Model model) {
        model.addAttribute("flight", new Flight());
        return "newFlightForm";
    }

    @GetMapping("/edit/{date}&{dest}&{origin}")
    public String showEditForm(Model model, @PathVariable("date") Date date,
                               @PathVariable("dest") String dest, @PathVariable("origin") String origin) {
        MyId id = new MyId(date, origin, dest);
        Flight flight = service.getById(id);
        model.addAttribute("flight", flight);
        return "newFlightForm";
    }

    @PostMapping("/new")
    public String addFlight(Flight flight) {
        service.save(flight);
        return "redirect:";
    }

    @DeleteMapping("/delete/{date}&{dest}&{origin}")
    public String delete(@PathVariable("date") Date date, @PathVariable("dest") String dest, @PathVariable("origin") String origin) {
        MyId id = new MyId(date, origin,dest);
        Flight flight = service.getById(id);
        service.delete(flight);
        return "index";
    }
}
