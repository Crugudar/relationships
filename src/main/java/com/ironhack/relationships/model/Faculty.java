package com.ironhack.relationships.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String department;
    private Boolean tenure;


    public Faculty() {
    }

    public Faculty(String firstName, String lastName, String department, Boolean tenure) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.tenure = tenure;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Boolean getTenure() {
        return tenure;
    }

    public void setTenure(Boolean tenure) {
        this.tenure = tenure;
    }
}
