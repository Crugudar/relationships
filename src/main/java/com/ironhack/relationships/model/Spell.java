package com.ironhack.relationships.model;

import com.ironhack.relationships.enums.Level;

import javax.persistence.*;
import java.util.List;

@Entity
public class Spell {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Level level;

    @ManyToMany(mappedBy = "spells")
    private List<Student> students;

    public Spell() {
    }

    public Spell(String name, Level level) {
        this.name = name;
        this.level = level;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
