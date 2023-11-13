package com.antonioluiz.portifolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antonioluiz.portifolio.entities.Product;
import com.antonioluiz.portifolio.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productrepository;

	public List<Product> findAll(){
		return productrepository.findAll();
		
	};
	
	public Product findById(Long id) {
		Optional<Product> obj=productrepository.findById(id);
		return obj.get();
		
	}
}
