package com.antonioluiz.portifolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.antonioluiz.portifolio.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
