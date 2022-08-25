package com.prueba.asd.services;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.asd.models.ActivoFijoModel;
import com.prueba.asd.repositories.ActivoFijoRepository;

@Service
public class ActivoFijoService {

	@Autowired
	ActivoFijoRepository activoFijoRepository;

	public ArrayList<ActivoFijoModel> obtenerActivoFijo() {
		return (ArrayList<ActivoFijoModel>) activoFijoRepository.findAll();
	}

	public ActivoFijoModel guardarActivoFijo(ActivoFijoModel activoFijo) {
		return activoFijoRepository.save(activoFijo);
	}

	public Optional<ActivoFijoModel> buscarId(Long id) {
		return activoFijoRepository.findById(id);
	}

	public ArrayList<ActivoFijoModel> buscarTipo(String tipo) {
		return activoFijoRepository.findByTipo(tipo);
	}

	public ArrayList<ActivoFijoModel> buscarSerial(Integer serial) {
		return activoFijoRepository.findBySerial(serial);
	}

	public ArrayList<ActivoFijoModel> buscarFechaCompra(Date fechaCompra) {
		return activoFijoRepository.findByFechaCompra(fechaCompra);
	}

	public boolean eliminarActivoFijo(Long Id) {
		try {
			activoFijoRepository.deleteById(Id);
			return true;
		} catch (Exception err) {
			return false;
		}
	}

}
