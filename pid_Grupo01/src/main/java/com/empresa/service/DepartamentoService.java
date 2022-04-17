package com.empresa.service;

import java.util.List;
import java.util.Optional;

import com.empresa.entity.Departamento;


public interface DepartamentoService {
	public abstract List<Departamento> listaDepartamento();
	public abstract Departamento insertaActualizaDepartamento(Departamento obj);
	public abstract List<Departamento> listaPorPiso(String piso);
	public abstract void eliminaDepartamentoPorId(int idDepartamento);
	public abstract Optional<Departamento> buscaDepartamentoPorId(int idDepartamento);

}
