package control;

import factory.FlorIF;
import factory.Margarida;
import factory.Orquidea;
import factory.Rosa;

public class FlorFacroty {
	public FlorIF gerarFlor(String flor){
		if(flor == "" || flor == null){
			return null;
			}
			if(flor.toUpperCase().equals("ROSA")){
			return new Rosa();
			} else if(flor.toUpperCase().equals("MARGARIDA")){
			return new Margarida();
			} else if(flor.toUpperCase().equals("ORQUIDEA")){
			return new Orquidea();
			}
			return null;
	}
}
