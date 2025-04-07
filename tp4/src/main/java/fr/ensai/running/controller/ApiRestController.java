package fr.ensai.running.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ensai.running.model.Athlete;
import fr.ensai.running.service.AthleteService;

@RestController
@RequestMapping("/api")
public class ApiRestController {

    @Autowired
    private AthleteService athleteService;

    /**
     * Get all athletes
     */
    @GetMapping("/athlete")
    public List<Athlete> allAthletes() {

        return athleteService.findAll();
    }

    /**
     * Get an athlete by id
     */
    @GetMapping("/athlete/{id}")
    public Athlete findAthletesById(@PathVariable("id") Long id) {

        return athleteService.findById(id);
    }

    /**
     * Delete an athlete by id
     */
    @DeleteMapping("/delete/{id}")
    public void deleteAthlete(@PathVariable("id") Long id) {
        athleteService.deleteById(id);
    }

    /**
     * Create an athlete
     */
    @PostMapping("/create")
    public Athlete createAthlete(@RequestBody Athlete athlete) {
        return athleteService.save(athlete);
    }

}
