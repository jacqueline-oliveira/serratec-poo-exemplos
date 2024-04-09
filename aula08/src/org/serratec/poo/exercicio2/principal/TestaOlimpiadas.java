package org.serratec.poo.exercicio2.principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.serratec.poo.exercicio2.classes.Atleta;
import org.serratec.poo.exercicio2.classes.ComissaoTecnica;
import org.serratec.poo.exercicio2.classes.Olimpiadas;
import org.serratec.poo.exercicio2.classes.Pais;
import org.serratec.poo.exercicio2.classes.Treinador;

public class TestaOlimpiadas {
	public static void main(String[] args) {
		List<Olimpiadas> timeDasOlimpiadas = new ArrayList<>();
		
		Pais brasil = new Pais("Brasil");
		Pais argentina = new Pais("Argentina");
		
		Atleta atleta1 = new Atleta("Lucas", "peso médio", brasil);
		Atleta atleta2 = new Atleta("Wagner", "peso pesado", argentina);
		
		atleta1.setPeso(70);
		atleta2.setPeso(85);
		
		ComissaoTecnica fulano1 = new ComissaoTecnica("Alberto", "desnecessário", argentina);
		fulano1.setEmDiaComAsObrigacoesLegais(true);
		ComissaoTecnica fulano2 = new ComissaoTecnica("Mané", "aspone", brasil);
		fulano2.setEmDiaComAsObrigacoesLegais(false);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		Treinador treinador1 = new Treinador("Kaiky", LocalDate.parse("2025-05-30"), argentina);
		Treinador treinador2 = new Treinador("Nicolle", LocalDate.parse("31/01/2023", df), brasil);
		
		timeDasOlimpiadas.add(atleta1);
		timeDasOlimpiadas.add(atleta2);
		timeDasOlimpiadas.add(fulano1);
		timeDasOlimpiadas.add(fulano2);
		timeDasOlimpiadas.add(treinador1);
		timeDasOlimpiadas.add(treinador2);
		
		for (Olimpiadas membro : timeDasOlimpiadas) {
			System.out.println(membro.verificaSituacao());
		}
		
	
	}

}
