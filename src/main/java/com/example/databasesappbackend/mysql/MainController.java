package com.example.databasesappbackend.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        System.out.println("GET new form");
        return "newForm";
    }

    @GetMapping("/edit/{date}&{origin}&{dest}")
    public String showEdit(Model model, @PathVariable("date") Date date, @PathVariable("origin") String origin, @PathVariable("dest") String dest) {
        MyId id = new MyId(date, origin, dest);
        Flight f = service.getById(id);
        model.addAttribute("flight", f);
        return "newForm";
    }

    @PostMapping("/save")
    public String addFlight(Flight flight) {
        System.out.println("POST flight");
        service.save(flight);
        return "redirect:";
    }

    @GetMapping("/delete/{date}&{origin}&{dest}")
    public String delete(@PathVariable("date") Date date, @PathVariable("origin") String origin, @PathVariable("dest") String dest) {
        System.out.println("DELETE flight");
        MyId id = new MyId(date, origin, dest);
        Flight flight = service.getById(id);
        System.out.println(flight);
        service.delete(flight);
        return "redirect:/";
    }

}
