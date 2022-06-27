package com.knoldus.repo;

import com.knoldus.entites.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * the type personRepo interface
 */
public interface PersonRepo extends JpaRepository<Person, Integer> {
    @Query("SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE END FROM Person s WHERE s.personId = ?1")
    Boolean isPersonExitsById(Integer id);

}
