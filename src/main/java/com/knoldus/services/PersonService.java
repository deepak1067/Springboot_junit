package com.knoldus.services;

import com.knoldus.entites.Person;
import com.knoldus.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * the type PersonService class
 */
@Service
public class PersonService {
    @Autowired
    private PersonRepo repo;

    /**
     * get all persons
     * @return all persons
     */
    public List<Person> getAllPerson() {
        return this.repo.findAll();
    }

    /**
     * person service
     * @param repo the repo
     */
    public PersonService(PersonRepo repo) {
        this.repo = repo;
    }
}
