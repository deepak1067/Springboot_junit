package com.knoldus.controllers;


import com.knoldus.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type PersonController
 */
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    /**
     * Get all persons
     * @return all persons
     */
    @GetMapping("/persons")
    public ResponseEntity<?> getAllPersons() {
        return ResponseEntity.ok(this.personService.getAllPerson());
    }
}
