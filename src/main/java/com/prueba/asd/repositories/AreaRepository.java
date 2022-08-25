package com.prueba.asd.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.asd.models.AreaModel;

@Repository
public interface AreaRepository extends CrudRepository<AreaModel, Long> {
	public abstract ArrayList<AreaModel> findByNombre(String Nombre);

	public abstract ArrayList<AreaModel> findByCiudad(String Ciudad);
}
