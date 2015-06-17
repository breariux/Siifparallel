package org.openxava.siifparallel.calculadores;

import javax.persistence.*;
import org.openxava.calculators.*;
import org.openxava.jpa.*;

public class NextNumberPrograma implements ICalculator {
	
	private int identificacion;
	
	public Object calculate() throws Exception {		
		Query query = XPersistence.getManager()
				.createQuery("SELECT max(identificacion) "+
								"FROM Planes_Programa "+
								"WHERE obje_identificacion ="+identificacion+"");
		//query.setParameter(0, getYear());
		//query.setParameter("identificacion", identificacion);
		Integer lastNumber = (Integer) query.getSingleResult();
		return lastNumber == null?1:lastNumber + 1;
	}	
	
	public int getIdentificacion(){
		return identificacion;
	}
	
	public void setIdentificacion(int identificacion){
		this.identificacion = identificacion;
	}
}
