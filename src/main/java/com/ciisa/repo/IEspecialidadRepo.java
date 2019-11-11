package com.ciisa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciisa.model.Especialidad;

//@Repository
public interface IEspecialidadRepo extends JpaRepository<Especialidad, Integer>{
	
}
