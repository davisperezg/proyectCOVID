package com.proyecto.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="triaje")

public class Triaje implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="idTriaje")
	private int idTriaje;
	
	@Column(name="pregunta1")
	private String pregunta1;
	
	@Column(name="pregunta2")
	private String pregunta2;
	
	@Column(name="pregunta3")
	private String pregunta3;
	
	@Column(name="pregunta4")
	private String pregunta4;
	
	@Column(name="pregunta5")
	private String pregunta5;
	
	@Column(name="estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name="idCiudadanos")
	private Ciudadanos ciudadanos;
	
	

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Ciudadanos getCiudadanos() {
		return ciudadanos;
	}

	public void setCiudadanos(Ciudadanos ciudadanos) {
		this.ciudadanos = ciudadanos;
	}

	public int getIdTriaje() {
		return idTriaje;
	}

	public void setIdTriaje(int idTriaje) {
		this.idTriaje = idTriaje;
	}

	public String getPregunta1() {
		return pregunta1;
	}

	public void setPregunta1(String pregunta1) {
		this.pregunta1 = pregunta1;
	}

	public String getPregunta2() {
		return pregunta2;
	}

	public void setPregunta2(String pregunta2) {
		this.pregunta2 = pregunta2;
	}

	public String getPregunta3() {
		return pregunta3;
	}

	public void setPregunta3(String pregunta3) {
		this.pregunta3 = pregunta3;
	}

	public String getPregunta4() {
		return pregunta4;
	}

	public void setPregunta4(String pregunta4) {
		this.pregunta4 = pregunta4;
	}

	public String getPregunta5() {
		return pregunta5;
	}

	public void setPregunta5(String pregunta5) {
		this.pregunta5 = pregunta5;
	}
	
	
	
}
