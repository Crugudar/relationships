package com.ironhack.relationships.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Section {

    @Id
    private String id;
    private Short roomNum;
    private String instructor;
    @ManyToOne
    @JoinColumn(name = "course_code")
    private Course course;

    public Section() {
    }

    public Section(String id, Short roomNum, String instructor, Course course) {
        this.id = id;
        this.roomNum = roomNum;
        this.instructor = instructor;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Short getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Short roomNum) {
        this.roomNum = roomNum;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
