package com.ironhack.relationships.repository;

import com.ironhack.relationships.model.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OfficeRepository extends JpaRepository<Office, Integer> {

    public Optional<Office> findByFacultyLastName(String lastName);

    @Query("SELECT o.roomNumber FROM Office o JOIN o.faculty f WHERE f.lastName = :lastName")
    public Integer findOfficeNumberByFacultyLastName(@Param("lastName") String lastName);

}