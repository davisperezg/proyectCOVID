package com.proyecto.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name="Ciudadanos")
public class Ciudadanos implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idCiudadanos")
	private int idCiudadanos;
	
	@Column(name="nombres")
	private String nombres;
	
	@Column(name="celular")
	private String celular;
	
	@Column(name="nacionalidad")
	private String nacionalidad;
	
	@Column(name="tipoDocumento")
	private String tipoDocumento;
	
	@Column(name="numeroDocumento")
	private String numeroDocumento;
	
	@OneToMany(mappedBy="ciudadanos")
	@JsonIgnore
	private List<Triaje> triaje ;
	
	
	
	public List<Triaje> getTriaje() {
		return triaje;
	}

	public void setTriaje(List<Triaje> triaje) {
		this.triaje = triaje;
	}

	public int getIdCiudadanos() {
		return idCiudadanos;
	}

	public void setIdCiudadanos(int idCiudadanos) {
		this.idCiudadanos = idCiudadanos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}
 
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
}