package com.antonioluiz.portifolio.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antonioluiz.portifolio.entities.User;
import com.antonioluiz.portifolio.service.UserService;

@RestController
@RequestMapping (value="/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User>list=service.findAll();
//		User u= new User(1L,"Luiz","luiz@gmail.com","8888888","12345");
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj=service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
