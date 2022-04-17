package com.empresa.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tipoDepartamento")
@Getter
@Setter
public class TipoDepartamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipo;
	private String Descrip;
	private int nroDormitorios;
	private int nroBaños;
	private String AreaDepar;
	private double precMens;
}
