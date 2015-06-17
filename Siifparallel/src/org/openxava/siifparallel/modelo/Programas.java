package org.openxava.siifparallel.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
@Table(name="PROGRAMAS", schema="siif")
@Tab(properties="facultad.nombref,programa,nombreprograma")
@Views({
		@View(name="Simple",
				members="nombreprograma"),
		@View(name="Default",
		members="facultad;programa;nombreprograma")
		
}
)

public class Programas implements java.io.Serializable {

	@Id	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="facultad")
	//@ReferenceView("Simple")
	@DescriptionsList(descriptionProperties="nombref")
	private Facultad facultad;
	
	public Facultad getFacultad() { 
		return facultad;  
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad; 
	}
		
	@Id 
	@Column (name="PROGRAMA")//,length=3)
	private String programa;	

	@Column(name="NOMBRE")//,length=200) 
	@ReadOnly
	private String nombreprograma;  
		
	////////////Gets and Sets////////////
	
	public String getPrograma() {
	return programa;
	}
	
	public void setPrograma(String programa) {
	this.programa = programa;
	}
	
	public String getNombreprograma() {
	return nombreprograma;
	}
	
	public void setNombreprograma(String nombreprograma) {
	this.nombreprograma = nombreprograma;
	}

}