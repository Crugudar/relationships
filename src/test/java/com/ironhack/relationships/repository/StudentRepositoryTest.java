package com.ironhack.relationships.repository;

import com.ironhack.relationships.enums.House;
import com.ironhack.relationships.enums.Wing;
import com.ironhack.relationships.model.HouseAssignment;
import com.ironhack.relationships.model.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private HouseAssignmentRepository houseAssignmentRepository;

    @BeforeEach
    public void setUp() {
        HouseAssignment houseAssignment = houseAssignmentRepository.save(new HouseAssignment(House.GRYFFINDOR, Wing.EAST, 123));
        Student student = studentRepository.save(new Student("Harry", "Potter", houseAssignment));
    }

    @AfterEach
    public void tearDown() {
        studentRepository.deleteAll();
        houseAssignmentRepository.deleteAll();
    }

    @Test
    public void findByFirstName_ExistingName_Student() {

        Optional<Student> student = studentRepository.findByFirstName("Harry");
        if (student.isPresent()) {
            assertEquals("Potter", student.get().getLastName());
            assertEquals(123, student.get().getHouseAssignment().getAssignedBed());
        } else {
            fail("Student is not present");
        }
    }

    @Test
    public void findByHouseAssignmentAssignedBed_ExistingBed_Student() {

        Optional<Student> student = studentRepository.findByHouseAssignmentAssignedBed(123);
        if (student.isPresent()) {
            assertEquals("Potter", student.get().getLastName());
        } else {
            fail("Student is not present");
        }
    }


}