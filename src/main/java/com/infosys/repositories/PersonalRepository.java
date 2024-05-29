package com.infosys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.entities.Personal;
import com.infosys.entities.User;

@Repository
public interface PersonalRepository extends JpaRepository<Personal , Integer> {
 
	Personal findByRid(int rid);
}
