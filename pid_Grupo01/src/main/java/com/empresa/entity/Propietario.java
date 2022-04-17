package com.empresa.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "propietario")
@Getter
@Setter
public class Propietario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPropietario;
	private String NomProp;
	private String ApelProp;
	private String dniProp;
	private String CorreoProp;
	private String MovilProp;
	private int nroPersonas;
	private int nroMascotas;
}
