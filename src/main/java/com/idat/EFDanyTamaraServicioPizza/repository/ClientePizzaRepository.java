package com.idat.EFDanyTamaraServicioPizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFDanyTamaraServicioPizza.entity.ClientePizza;

@Repository
public interface ClientePizzaRepository extends JpaRepository<ClientePizza,Integer> {

}
