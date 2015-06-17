package org.openxava.siifparallel.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
@Table(name="FACULTADES", schema="siif")
@Views({
		@View(name="Simple",
				members="nombref"),
		@View(members="facultad,nombref")
}
)
public class Facultad {
	
	@Id
	@Column (name="FACULTAD")
	private String facultad;
	
	@Column(name="NOMBRE") 
	@ReadOnly
	private String nombref; 
		
	////////////Gets and Sets////////////
	
	public String getFacultad() {
	return facultad;
	}
	
	public void setFacultad(String facultad) {
	this.facultad = facultad;
	}
		
	public String getNombref() {
	return nombref;
	}
	
	public void setNombref(String nombref) {
	this.nombref = nombref;
	}
		
}
