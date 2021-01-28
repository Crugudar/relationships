package com.ironhack.relationships.model;

import javax.persistence.*;

@Entity
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer roomNumber;
    private String building;

    @OneToOne
    @JoinColumn(name = "faculty_id")
    private Faculty faculty;

    public Office(Integer roomNumber, String building, Faculty faculty) {
        this.roomNumber = roomNumber;
        this.building = building;
        this.faculty = faculty;
    }

    public Office() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
