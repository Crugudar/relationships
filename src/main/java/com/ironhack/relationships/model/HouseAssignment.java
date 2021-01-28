package com.ironhack.relationships.model;

import com.ironhack.relationships.enums.House;
import com.ironhack.relationships.enums.Wing;

import javax.persistence.*;

@Entity
public class HouseAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private House house;
    @Enumerated(EnumType.STRING)
    private Wing wing;
    private Integer assignedBed;

    @OneToOne(mappedBy = "houseAssignment")
    private Student student;

    public HouseAssignment() {
    }

    public HouseAssignment(House house, Wing wing, Integer assignedBed) {
        this.house = house;
        this.wing = wing;
        this.assignedBed = assignedBed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Wing getWing() {
        return wing;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }

    public Integer getAssignedBed() {
        return assignedBed;
    }

    public void setAssignedBed(Integer assignedBed) {
        this.assignedBed = assignedBed;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
