package com.antonioluiz.portifolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antonioluiz.portifolio.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
