package com.ironhack.relationships.repository;

import com.ironhack.relationships.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {

    @Query("SELECT c FROM Course c JOIN FETCH c.sections WHERE c.courseCode = :id")
    public Optional<Course> findByIdWithSections(@Param("id") String id);
}
