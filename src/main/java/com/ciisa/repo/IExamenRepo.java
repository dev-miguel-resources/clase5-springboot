package com.ciisa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciisa.model.Examen;

//@Repository
public interface IExamenRepo extends JpaRepository<Examen, Integer>{
	
}
