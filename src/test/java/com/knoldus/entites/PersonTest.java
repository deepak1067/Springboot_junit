package com.knoldus.entites;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * the type PersonTest
 */
class PersonTest {

    @Test
    void testConstructor() {
        Person actualPerson = new Person();
        actualPerson.setPersonCity("Person City");
        actualPerson.setPersonId(123);
        actualPerson.setPersonName("Person Name");
        assertEquals("Person City", actualPerson.getPersonCity());
        assertEquals(123, actualPerson.getPersonId().intValue());
        assertEquals("Person Name", actualPerson.getPersonName());
    }

}

