package com.antonioluiz.portifolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.antonioluiz.portifolio.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	
}
