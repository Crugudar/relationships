package com.ironhack.relationships.repository;

import com.ironhack.relationships.model.HouseAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseAssignmentRepository extends JpaRepository<HouseAssignment, Integer> {
}
