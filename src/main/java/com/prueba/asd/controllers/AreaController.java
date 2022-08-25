package com.prueba.asd.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.asd.models.ActivoFijoModel;
import com.prueba.asd.models.AreaModel;
import com.prueba.asd.services.AreaService;

@RestController
@RequestMapping("/area")
public class AreaController {

	@Autowired
	AreaService areaService;

	@GetMapping
	public ArrayList<AreaModel> obtenerArea() {
		return areaService.obtenerArea();
	}

	@PostMapping
	public AreaModel guardarArea(@RequestBody AreaModel area) {
		return this.areaService.guardarArea(area);
	}

	@GetMapping(path = "/(id)")
	public Optional<AreaModel> buscarId(@PathVariable("id") Long id) {
		return this.areaService.buscarId(id);
	}

	@GetMapping(path = "/(nombre)")
	public ArrayList<AreaModel> buscarNombre(@PathVariable("nombre") String nombre) {
		return this.areaService.buscarNombre(nombre);
	}

	@GetMapping(path = "/(ciudad)")
	public ArrayList<AreaModel> buscarCiudad(@PathVariable("ciudad") String ciudad) {
		return this.areaService.buscarCiudad(ciudad);
	}

	@DeleteMapping(path = "/{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean ok = this.areaService.eliminarArea(id);
		if (ok) {
			return "el Activo Fijo con ID: " + id + ", Se elimino correctamente";
		} else {
			return "el Activo Fijo con ID:" + id + ", no se pudo eliminar, verifique he intente nuevamente";
		}
	}

}
