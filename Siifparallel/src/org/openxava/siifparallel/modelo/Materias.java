package org.openxava.siifparallel.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity

@View(members="materia; "
		+ "nombre; "
		+ "programas; "
		+ "semestre; " 
	//	+ "area, semestre, creditos, tipo; "
		+ "ac; "
		+ "perfildocente;")

//@Tab(properties="programas.facultad.nombref,programas.nombreprograma,materia,semestre.descripcion,nombre,creditos,perfildocente")//,areaconocimiento.codigoac
@Table(name="MATERIAS", schema="siif")
public class Materias implements java.io.Serializable {
	
	@Id
	@ManyToOne(fetch=FetchType.LAZY)	
	@JoinColumns({
		@JoinColumn(name="facultad",referencedColumnName="facultad"),
		@JoinColumn(name="programa",referencedColumnName="programa")
				}			
			)
	@ReferenceView("Default")
	//@DescriptionsList(descriptionProperties="nombreprograma")
	private Programas programas; 
	 
	public Programas getProgramas() { 
		return programas;  
	}

	public void setProgramas(Programas programas) {
		this.programas = programas; 
	}
	
	@Id
	@Column(name="MATERIA")
	private int materia;
	
	@Id
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="semestre")
	//@ReferenceView("Simple")
	@DescriptionsList(descriptionProperties="descripcion")
	private Semestres semestre;
	
	public Semestres getSemestre(){
		return semestre;
	}
	
	public void setSemestre(Semestres semestre){
		this.semestre = semestre;
	}
		
	@Column(name="NOMBRE",length=100) 
	@ReadOnly
	private String nombre;
	
 	@Column(name="CREDITOS")
	@ReadOnly 
	private int creditos;
		
	@ManyToMany
	private Collection<Ac> ac;
	
	public Collection<Ac> getAc() {
		return ac;
	}

	public void setAc(Collection<Ac> ac) {
		this.ac = ac; 
	}
	
	@Column(name="PERFIL_DOCENTE", length=200)   
	@Stereotype("MEMO")	
	private String perfildocente;
	
	////////////Gets and Sets////////////
	
	public int getMateria() {
		return materia;
	}

	public void setMateria(int materia) {
		this.materia = materia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	public String getPerfildocente() {
		return perfildocente;
	}

	public void setPerfildocente(String perfildocente) {
		this.perfildocente = perfildocente;
	}
	
}
