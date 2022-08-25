package com.prueba.asd.repositories;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.asd.models.ActivoFijoModel;
import com.prueba.asd.models.UsuarioModel;

@Repository
public interface ActivoFijoRepository extends CrudRepository<ActivoFijoModel, Long> {
	public abstract ArrayList<ActivoFijoModel> findBySerial(Integer serial);

	public abstract ArrayList<ActivoFijoModel> findByTipo(String tipo);

	public abstract ArrayList<ActivoFijoModel> findByFechaCompra(Date fechaCompra);

}
