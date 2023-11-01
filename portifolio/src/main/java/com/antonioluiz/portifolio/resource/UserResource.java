package com.antonioluiz.portifolio.resource;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antonioluiz.portifolio.entities.User;

@RestController
@RequestMapping (value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
//		User u= new User();
		User u= new User(1L,"Luiz","luiz@gmail.com","8888888","12345");
		return ResponseEntity.ok().body(u);
//		List<User> li= new LinkedList<User>(); {
//			
//			for(User n:li){
//				System.out.println(n);
//			}
//		};
	}
	

}
