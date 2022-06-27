package com.knoldus.entites;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The type Person Class
 */
@Entity
@Table(name="Person")
public class Person {
    @Id
    private Integer personId;
    private String personName;
    private String personCity;

    /**
     *
     * @param personId the personId
     * @param personName the personName
     * @param personCity the personCity
     */
    public Person(Integer personId, String personName, String personCity) {

        this.personId = personId;
        this.personName = personName;
        this.personCity = personCity;
    }

    public Person() {
    }

    /**
     * get person Id
     * @return person id
     */
    public Integer getPersonId() {
        return personId;
    }

    /**
     * set person Id
     * @param personId the person Id
     */
    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    /**
     * get personName
     * @return person name
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * set personName
     * @param personName the personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /**
     * get personCity
     * @return personCity
     */
    public String getPersonCity() {
        return personCity;
    }

    /**
     * set personCity
     * @param personCity the personCity
     */
    public void setPersonCity(String personCity) {
        this.personCity = personCity;
    }
}
