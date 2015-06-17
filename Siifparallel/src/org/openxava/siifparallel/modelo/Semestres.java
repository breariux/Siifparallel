package org.openxava.siifparallel.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
@Table(name="SEMESTRES", schema="siif")
public class Semestres {

	@Id
	@Column (name="SEMESTRE")
	private int semestre;
	
	@Column(name="DESCRIPCION") 
	@ReadOnly
	private String descripcion; 
		
	////////////Gets and Sets////////////
	
	public int getSemestre() {
	return semestre;
	}
	
	public void setSemestre(int semestre) {
	this.semestre = semestre;
	}
		
	public String getDescripcion() {
	return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
	}
}
