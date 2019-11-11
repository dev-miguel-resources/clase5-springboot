package com.ciisa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciisa.model.Medico;

//@Repository
public interface IMedicoRepo extends JpaRepository<Medico, Integer>{
	
}
