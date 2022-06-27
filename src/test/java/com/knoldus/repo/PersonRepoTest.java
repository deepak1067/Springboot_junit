package com.knoldus.repo;

import com.knoldus.entites.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * the type PersonrRepoTest class
 */
class PersonRepoTest {

    @Autowired
    private PersonRepo personRepo;

    /**
     * person ExitsById
     */
    @Test
    void isPersonExitsById() {
        Person person = new Person(1234, "Deepak", "Dhampur");
        personRepo.save(person);
        Boolean actualResult = personRepo.isPersonExitsById(1234);
        assertThat(actualResult).isTrue();

    }

    @AfterEach
    void tearDown() {
        System.out.println("tearing down");
        personRepo.deleteAll();
    }

    @BeforeEach
    void setUp() {
        System.out.println("setting up");
    }
}