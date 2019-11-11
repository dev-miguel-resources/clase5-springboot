package com.ciisa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciisa.model.Consulta;

//@Repository
public interface IConsultaRepo extends JpaRepository<Consulta, Integer>{
	
}
