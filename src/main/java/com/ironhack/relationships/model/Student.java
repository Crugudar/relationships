package com.ironhack.relationships.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "house_assignment_id")
    private HouseAssignment houseAssignment;

    @ManyToMany
    @JoinTable(
            name = "students_casts_spells",
            joinColumns = { @JoinColumn(name = "student_id") },
            inverseJoinColumns = { @JoinColumn(name = "spell_id") }
    )
    private List<Spell> spells;

    public Student() {
    }

    public Student(String firstName, String lastName, HouseAssignment houseAssignment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.houseAssignment = houseAssignment;
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

    public HouseAssignment getHouseAssignment() {
        return houseAssignment;
    }

    public void setHouseAssignment(HouseAssignment houseAssignment) {
        this.houseAssignment = houseAssignment;
    }

    public List<Spell> getSpells() {
        return spells;
    }

    public void setSpells(List<Spell> spells) {
        this.spells = spells;
    }
}
