package org.openxava.siifparallel.calculadores;

import javax.persistence.*;
import org.openxava.calculators.*;
import org.openxava.jpa.*;

public class NextNumberObjetivo implements ICalculator {

	public Object calculate() throws Exception {		
		Query query = XPersistence.getManager()
				.createQuery("SELECT max(identificaciones) "+
								"FROM Planes_Objetivo_especifico");
		//query.setParameter(0, getYear());
		//query.setParameter("identificacion", identificacion);
		Integer lastNumber = (Integer) query.getSingleResult();
		return lastNumber == null?1:lastNumber + 1;
	}

}