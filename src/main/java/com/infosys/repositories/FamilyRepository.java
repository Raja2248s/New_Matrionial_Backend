package com.infosys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.entities.Family;
import com.infosys.entities.Personal;

@Repository
public interface FamilyRepository extends JpaRepository<Family , Integer> {

	Family findByRid(int rid);
}
