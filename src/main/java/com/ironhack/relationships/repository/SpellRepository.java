package com.ironhack.relationships.repository;

import com.ironhack.relationships.model.Spell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpellRepository extends JpaRepository<Spell, Integer> {

}
