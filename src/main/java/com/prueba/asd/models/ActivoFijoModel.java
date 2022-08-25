package com.prueba.asd.models;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "activofijo")
public class ActivoFijoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;

	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private String descripcion;
	@Column(nullable = false)
	private String tipo;// buscarTipo
	@Column(nullable = false)
	private Integer serial;// buscarSerial
	@Column(nullable = false)
	private Integer numeroInterno;
	private Integer alto;
	private Integer ancho;
	private Integer largo;
	private Integer peso;
	private Integer valorCompra;
	@Column(nullable = false)
	private Date fechaCompra;// buscarFechaCompra
	private Long areaAsignada;
	private Long personaAsignada;

	// @ManyToOne(fetch = FetchType.LAZY)
	// @JoinColumn(name = "idArea")
	// private AreaModel area;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getSerial() {
		return serial;
	}

	public void setSerial(Integer serial) {
		this.serial = serial;
	}

	public Integer getNumeroInterno() {
		return numeroInterno;
	}

	public void setNumeroInterno(Integer numeroInterno) {
		this.numeroInterno = numeroInterno;
	}

	public Integer getAlto() {
		return alto;
	}

	public void setAlto(Integer alto) {
		this.alto = alto;
	}

	public Integer getAncho() {
		return ancho;
	}

	public void setAncho(Integer ancho) {
		this.ancho = ancho;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public Integer getLargo() {
		return largo;
	}

	public void setLargo(Integer largo) {
		this.largo = largo;
	}

	public Integer getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(Integer valorCompra) {
		this.valorCompra = valorCompra;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Long getAreaAsignada() {
		return areaAsignada;
	}

	public void setAreaAsignada(Long areaAsignada) {
		this.areaAsignada = areaAsignada;
	}

	public Long getPersonaAsignada() {
		return personaAsignada;
	}

	public void setPersonaAsignada(Long personaAsignada) {
		this.personaAsignada = personaAsignada;
	}

}
