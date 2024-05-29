package com.infosys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.entities.Education;
import com.infosys.entities.Personal;

@Repository
public interface EducationRepository extends JpaRepository<Education , Integer>{
  
	Education findByRid(int rid);
}
