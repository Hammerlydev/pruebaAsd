package com.prueba.asd.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.asd.models.UsuarioModel;
import com.prueba.asd.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	public ArrayList<UsuarioModel> obtenerUsuarios() {
		return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
	}

	public UsuarioModel guardarUsuario(UsuarioModel usuario) {
		return usuarioRepository.save(usuario);
	}

	public Optional<UsuarioModel> buscarId(Long id) {
		return usuarioRepository.findById(id);
	}

	public ArrayList<UsuarioModel> buscarDocumento(Integer documento) {
		return usuarioRepository.findByDocumento(documento);
	}

	public boolean eliminarUsuario(Long Id) {
		try {
			usuarioRepository.deleteById(Id);
			return true;
		} catch (Exception err) {
			return false;
		}
	}

}
