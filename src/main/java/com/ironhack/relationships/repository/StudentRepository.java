package com.ironhack.relationships.repository;

import com.ironhack.relationships.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    public Optional<Student> findByFirstName(String firstName);

    @Query("SELECT s FROM Student s LEFT JOIN FETCH s.spells WHERE s.firstName = :firstName")
    public Optional<Student> findByFirstNameWithSpells(@Param("firstName") String firstName);

    public Optional<Student> findByHouseAssignmentAssignedBed(Integer assignedBed);



}
