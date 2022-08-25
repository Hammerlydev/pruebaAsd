package com.prueba.asd.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.asd.models.AreaModel;
import com.prueba.asd.repositories.AreaRepository;

@Service
public class AreaService {

	@Autowired
	AreaRepository areaRepository;

	public ArrayList<AreaModel> obtenerArea() {
		return (ArrayList<AreaModel>) areaRepository.findAll();
	}

	public AreaModel guardarArea(AreaModel area) {
		return areaRepository.save(area);
	}

	public Optional<AreaModel> buscarId(Long id) {
		return areaRepository.findById(id);
	}

	public ArrayList<AreaModel> buscarNombre(String nombre) {
		return areaRepository.findByNombre(nombre);
	}

	public ArrayList<AreaModel> buscarCiudad(String ciudad) {
		return areaRepository.findByCiudad(ciudad);
	}

	public boolean eliminarArea(Long Id) {
		try {
			areaRepository.deleteById(Id);
			return true;
		} catch (Exception err) {
			return false;
		}
	}
}
