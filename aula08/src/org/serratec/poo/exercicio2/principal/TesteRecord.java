package org.serratec.poo.exercicio2.principal;

import org.serratec.poo.exercicio2.classes.EstadoCivil;
import org.serratec.poo.exercicio2.classes.Pais;
import org.serratec.poo.exercicio2.classes.Presidente;

public class TesteRecord {
	public static void main(String[] args) {
		Presidente presidente = new Presidente("Lula", new Pais("Brasil"), 2024, EstadoCivil.CASADO);
		System.out.println(presidente);
		
	}

}
