package org.openxava.siifparallel.modelo;

import javax.persistence.*;


@Entity
@Table(name="AC", schema="SBETANCUR")
public class Ac {

	@Id 
	@Column(name="AC")//,length=2)
	//@ReadOnly
	//@DefaultValueCalculator(value=NextNumberCampoConocimiento.class)
	private int ac;
	
	@Column(name="DESCRIPCIONAC")//,length=20)
	//@Required
	private String descripcionac;
		  
	////////////Gets and Sets////////////
	
	public int getAc() {
		return ac;
	}

	public void setAc(int ac) {
		this.ac = ac;
	}
	public String getDescripcionac() {
		return descripcionac;
	}

	public void setDescripcionac(String descripcionac) {
		this.descripcionac = descripcionac;
	}
	
}