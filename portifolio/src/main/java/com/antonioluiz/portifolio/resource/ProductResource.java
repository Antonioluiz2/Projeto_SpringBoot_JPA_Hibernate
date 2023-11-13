package com.antonioluiz.portifolio.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antonioluiz.portifolio.entities.Product;
import com.antonioluiz.portifolio.service.ProductService;

@RestController
@RequestMapping (value="/products")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product>list=service.findAll();
//		Product u= new Product(1L,"Luiz","luiz@gmail.com","8888888","12345");
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product obj=service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
