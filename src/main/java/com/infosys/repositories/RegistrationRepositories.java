package com.infosys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.infosys.entities.Registration;


@Repository
public interface RegistrationRepositories extends JpaRepository<Registration , Integer> {
	Registration findByEmail(String email);
}
