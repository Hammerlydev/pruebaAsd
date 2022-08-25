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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.asd.models.UsuarioModel;
import com.prueba.asd.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@GetMapping
	public ArrayList<UsuarioModel> obtenerUsuarios() {
		return usuarioService.obtenerUsuarios();
	}

	@PostMapping
	public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
		return this.usuarioService.guardarUsuario(usuario);
	}

	@GetMapping(path = "/(id)")
	public Optional<UsuarioModel> buscarId(@PathVariable("id") Long id) {
		return this.usuarioService.buscarId(id);
	}

	@GetMapping("/query")
	public ArrayList<UsuarioModel> buscarDocumento(@RequestParam("documento") Integer documento) {
		return this.usuarioService.buscarDocumento(documento);
	}

	@DeleteMapping(path = "/{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean ok = this.usuarioService.eliminarUsuario(id);
		if (ok) {
			return "el usuario con ID: " + id + ", Se elimino correctamente";
		} else {
			return "el usuario con ID:" + id + ", no se pudo eliminar, verifique he intente nuevamente";
		}
	}

}
