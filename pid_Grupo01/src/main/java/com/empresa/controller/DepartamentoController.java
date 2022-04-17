package com.empresa.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Departamento;
import com.empresa.service.DepartamentoService;

@RestController
@RequestMapping("/rest/departamento")
public class DepartamentoController {
	
	@Autowired
	private DepartamentoService service;

	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Departamento>> listaDepartamento(){
		List<Departamento> lista = service.listaDepartamento();
		return ResponseEntity.ok(lista);
	}

	@PostMapping

	@ResponseBody

	public ResponseEntity<HashMap<String, Object>> insertaDepartamento(@RequestBody Departamento obj) {

		HashMap<String, Object> salida = new HashMap<String, Object>();

		try {

			List<Departamento> lstDepartamentos = service.listaPorPiso(obj.getPiso());

			if (CollectionUtils.isEmpty(lstDepartamentos)) {

				Departamento objSalida = service.insertaActualizaDepartamento(obj);

				if (objSalida == null) {

					salida.put("mensaje", "Error al insertar");

				} else {

					salida.put("mensaje", "Registro exitoso");

				}

			}

		} catch (Exception e) {

			salida.put("mensaje", "Error al insertar");

		}

		return ResponseEntity.ok(salida);

	}
	
	@PutMapping
	@ResponseBody

	public ResponseEntity<HashMap<String, Object>>actualizaDepartamento(@RequestBody Departamento obj) {

		HashMap<String, Object> salida = new HashMap<String, Object>();

		try {

			List<Departamento> lstDepartamentos = service.listaPorPiso(obj.getPiso());

			if (CollectionUtils.isEmpty(lstDepartamentos)) {

				salida.put("mensaje", "El Piso " + obj.getPiso() + " no existe");

			}else {

				Departamento objSalida = service.insertaActualizaDepartamento(obj);

				if (objSalida == null) {

					salida.put("mensaje", "Error al actualizar");

				} else {

					salida.put("mensaje", "Actualización exitosa");

				}

			}

		} catch (Exception e) {

			e.printStackTrace();

			salida.put("mensaje", "Error al actualizar");

		} 

		

		return ResponseEntity.ok(salida);

	}
	
	
	@DeleteMapping("/{id}")
	@ResponseBody

	public ResponseEntity<HashMap<String, Object>>eliminaDepartamento(@PathVariable(name = "id") String id) {

		HashMap<String, Object> salida = new HashMap<String, Object>();

		try {


		} catch (Exception e) {

			e.printStackTrace();

			salida.put("mensaje", "Error al eliminar");
		} 

		return ResponseEntity.ok(salida);

	}

}
