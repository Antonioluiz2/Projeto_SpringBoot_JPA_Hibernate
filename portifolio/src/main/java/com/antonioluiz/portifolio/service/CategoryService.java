package com.antonioluiz.portifolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antonioluiz.portifolio.entities.Category;
import com.antonioluiz.portifolio.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> findAll(){
		return categoryRepository.findAll();
		
	};
	
	public Category findById(Long id) {
		Optional<Category> obj=categoryRepository.findById(id);
		return obj.get();
		
	}
}
