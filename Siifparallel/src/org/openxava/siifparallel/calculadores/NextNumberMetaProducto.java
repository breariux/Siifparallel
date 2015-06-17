package org.openxava.siifparallel.calculadores;

import javax.persistence.*;
import org.openxava.calculators.*;
import org.openxava.jpa.*;

public class NextNumberMetaProducto implements ICalculator {
	
	private String programa;
	
	public Object calculate() throws Exception {
		Query query = XPersistence.getManager()
				.createQuery("SELECT max(identificacion) "+
								"FROM Planes_Meta_producto "+
								"WHERE programa_OID ='"+programa+"'");
		//query.setParameter(0, getYear());
		//query.setParameter("identificacion", identificacion);
		Integer lastNumber = (Integer) query.getSingleResult();
		return lastNumber == null?1:lastNumber + 1;
	}	
	
	public String getPrograma(){
		return programa;
	}
	
	public void setPrograma(String programa){
		this.programa = programa;
	}

}