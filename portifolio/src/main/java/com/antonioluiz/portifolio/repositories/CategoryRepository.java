package com.antonioluiz.portifolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.antonioluiz.portifolio.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
