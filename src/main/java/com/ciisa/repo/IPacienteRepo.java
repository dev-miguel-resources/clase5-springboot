package com.ciisa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciisa.model.Paciente;

//@Repository
public interface IPacienteRepo extends JpaRepository<Paciente, Integer>{
	
}
