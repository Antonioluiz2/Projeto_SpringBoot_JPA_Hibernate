package com.antonioluiz.portifolio.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_publicador")
public class Publicador implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String agy;
	private String adress;
	
	public Publicador() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Publicador(long i, String name, String agy, String adress) {
		this.id = i;
		this.name = name;
		this.agy = agy;
		this.adress = adress;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAgy() {
		return agy;
	}
	public void setAgy(String agy) {
		this.agy = agy;
	}
	public String getEndress() {
		return adress;
	}
	public void setEndress(String endress) {
		this.adress = endress;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicador other = (Publicador) obj;
		return Objects.equals(id, other.id);
	}

	
}
