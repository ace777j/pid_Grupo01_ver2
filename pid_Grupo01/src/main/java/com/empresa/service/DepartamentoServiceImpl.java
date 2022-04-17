package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Departamento;
import com.empresa.repository.DepartamentoRepository;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

	@Autowired
	private DepartamentoRepository repository;
	
	@Override
	public List<Departamento> listaDepartamento() {
		return repository.findAll();
	}

	@Override
	public Departamento insertaActualizaDepartamento(Departamento obj) {
		return repository.save(obj);
	}

	@Override
	public List<Departamento> listaPorPiso(String piso) {
		return repository.findByPiso(piso);
	}

	@Override
	public void eliminaDepartamentoPorId(int idDepartamento) {
		repository.deleteById(idDepartamento);

	}

	@Override
	public Optional<Departamento> buscaDepartamentoPorId(int idDepartamento) {
		return repository.findById(idDepartamento);
	}

}
