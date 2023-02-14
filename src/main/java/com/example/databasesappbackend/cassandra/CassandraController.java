package com.example.databasesappbackend.cassandra;


import com.example.databasesappbackend.mysql.Flight;
import com.example.databasesappbackend.mysql.FlightService;
import com.example.databasesappbackend.mysql.MyId;
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
    private FlightService service;

    @GetMapping("/cass")
    public String homePage(Model model) {
        List<Flight> flightList = service.getAll();
        flightList = flightList.subList(200, 300);
        model.addAttribute("flightList", flightList);
        return "index";
    }

    @GetMapping("/cass/new")
    public String showNewFlightForm(Model model) {
        model.addAttribute("flight", new Flight());
        System.out.println("GET new form");
        return "newForm";
    }

    @GetMapping("/cass/edit/{date}&{dest}&{origin}")
    public String showEdit(Model model, @PathVariable("date") Date date, @PathVariable("origin") String origin, @PathVariable("dest") String dest) {
        MyId id = new MyId(date, origin, dest);
        Flight f = service.getById(id);
        model.addAttribute("flight", f);
        return "newForm";
    }

    @PostMapping("/cass/save")
    public String addFlight(Flight flight) {
        System.out.println("POST flight");
        service.save(flight);
        return "redirect:";
    }

    @DeleteMapping("/cass/delete/{date}&{dest}&{origin}")
    public String delete(@PathVariable("date") Date date, @PathVariable("origin") String origin, @PathVariable("dest") String dest) {
        System.out.println("DELETE flight");
        MyId id = new MyId(date, origin, dest);
        Flight flight = service.getById(id);
        System.out.println(flight);
        service.delete(flight);
        return "redirect:/";
    }
}
