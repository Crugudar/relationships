package com.ironhack.relationships.repository;

import com.ironhack.relationships.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    public Optional<Student> findByFirstName(String firstName);

    public Optional<Student> findByHouseAssignmentAssignedBed(Integer assignedBed);

}
