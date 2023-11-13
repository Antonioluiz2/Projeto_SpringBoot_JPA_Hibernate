package com.antonioluiz.portifolio.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antonioluiz.portifolio.entities.Publicador;
import com.antonioluiz.portifolio.service.PublicadorService;

@RestController
@RequestMapping (value="/Publicador")
public class PublicadorResource {
	
	@Autowired
	private PublicadorService service;
	
	@GetMapping
	public ResponseEntity<List<Publicador>> findAll(){
		List<Publicador>list=service.findAll();
//		Publicador u= new Publicador(1L,"Luiz","luiz@gmail.com","8888888","12345");
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Publicador> findById(@PathVariable Long id){
		Publicador obj=service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
