package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Integer>{
	public abstract List<Departamento> findByPiso(String piso);

}
