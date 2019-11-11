package com.ciisa.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciisa.model.Paciente;
import com.ciisa.repo.IPacienteRepo;
import com.ciisa.service.IPacienteService;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired	
	private IPacienteRepo repo;
	
	@Override
	public Paciente registrar(Paciente pac) {
		return repo.save(pac);
	}

	@Override
	public Paciente modificar(Paciente pac) {		
		return repo.save(pac);
	}

	@Override
	public List<Paciente> listar() {
		return repo.findAll();
	}

	@Override
	public Paciente leerPorId(Integer id) {
		Optional<Paciente> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Paciente();
	}

	@Override
	public boolean eliminar(Integer id) {		
		repo.deleteById(id);
		return true;
	}

}
