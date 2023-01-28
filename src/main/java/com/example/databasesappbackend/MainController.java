package com.example.databasesappbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
        return "newFlightForm";
    }

    @GetMapping("/edit/{date}&{dest}&{origin}")
    public String showEditForm(Model model, @ModelAttribute Flight flight, BindingResult bindingResult, @PathVariable("date") Date date,
                               @PathVariable("dest") String dest, @PathVariable("origin") String origin) {
        MyId id = new MyId(date, origin, dest);
        System.out.println(id);
        Flight f = service.getById(id);
        model.addAttribute("flight", f);
        System.out.println("GET edit form");
        if(bindingResult.hasErrors()){
            System.out.println("There was a error "+bindingResult);
            System.out.println("Flight is: " + flight.getFl_date());
            return "index";
        }
        return "newFlightForm";
    }

    @PostMapping("/save")
    public String addFlight(Flight flight) {
        System.out.println("POST flight");
        service.save(flight);
        return "redirect:";
    }

    @DeleteMapping("/delete/{date}&{dest}&{origin}")
    public String delete(@PathVariable("date") Date date, @PathVariable("dest") String dest, @PathVariable("origin") String origin) {
        System.out.println("DELETE flight");
        MyId id = new MyId(date, origin, dest);
        Flight flight = service.getById(id);
        service.delete(flight);
        return "index";
    }

    @GetMapping
}
