package com.antonioluiz.portifolio.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antonioluiz.portifolio.entities.Category;
import com.antonioluiz.portifolio.service.CategoryService;

@RestController
@RequestMapping (value="/Categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category>list=service.findAll();
//		Category u= new Category(1L,"Luiz","luiz@gmail.com","8888888","12345");
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj=service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
