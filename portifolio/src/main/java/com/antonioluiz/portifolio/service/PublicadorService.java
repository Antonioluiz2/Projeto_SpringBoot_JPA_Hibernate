package com.antonioluiz.portifolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antonioluiz.portifolio.entities.Publicador;
import com.antonioluiz.portifolio.repositories.PublicadorRepository;

@Service
public class PublicadorService {
	
	@Autowired
	private PublicadorRepository repository;

	public List<Publicador> findAll(){
		return repository.findAll();
		
	};
	
	public Publicador findById(Long id) {
		Optional<Publicador> obj=repository.findById(id);
		return obj.get();
		
	}
}
