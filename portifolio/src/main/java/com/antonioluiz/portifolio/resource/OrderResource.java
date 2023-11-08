package com.antonioluiz.portifolio.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antonioluiz.portifolio.entities.Order;
import com.antonioluiz.portifolio.service.OrderService;

@RestController
@RequestMapping (value="/orders")
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order>list=service.findAll();
//		Order u= new Order(1L,"Luiz","luiz@gmail.com","8888888","12345");
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj=service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
