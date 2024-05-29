package com.infosys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.entities.User;

@Repository
public interface UserRepositories extends JpaRepository<User , Integer> {

	User findByRid(int rid);
	
}
