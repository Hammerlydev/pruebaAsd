package com.prueba.asd.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.asd.models.ActivoFijoModel;
import com.prueba.asd.services.ActivoFijoService;

@RestController
@RequestMapping("/activofijo")
public class ActivoFijoController {

	@Autowired
	ActivoFijoService activoFijoService;

	@GetMapping
	public ArrayList<ActivoFijoModel> obtenerActivoFijo() {
		return activoFijoService.obtenerActivoFijo();
	}

	@PostMapping
	public ActivoFijoModel guardarActivoFijo(@RequestBody ActivoFijoModel activoFijo) {
		System.out.println(activoFijo.getAreaAsignada());
		return this.activoFijoService.guardarActivoFijo(activoFijo);
	}

	@GetMapping("/id")
	public Optional<ActivoFijoModel> buscarId(@RequestParam("id") Long id) {
		return this.activoFijoService.buscarId(id);
	}

	@GetMapping("/tipo")
	public ArrayList<ActivoFijoModel> buscarTipo(@RequestParam("tipo") String tipo) {
		return this.activoFijoService.buscarTipo(tipo);
	}

	@GetMapping("/serial")
	public ArrayList<ActivoFijoModel> buscarSerial(@RequestParam("serial") Integer serial) {
		return this.activoFijoService.buscarSerial(serial);
	}

	@GetMapping("/fechacompra")
	public ArrayList<ActivoFijoModel> buscarFechaCompra(@RequestParam("fechaCompra") Date fechaCompra) {
		return this.activoFijoService.buscarFechaCompra(fechaCompra);
	}

	@DeleteMapping(path = "/{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean ok = this.activoFijoService.eliminarActivoFijo(id);
		if (ok) {
			return "el Activo Fijo con ID: " + id + ", Se elimino correctamente";
		} else {
			return "el Activo Fijo con ID:" + id + ", no se pudo eliminar, verifique he intente nuevamente";
		}
	}

}
