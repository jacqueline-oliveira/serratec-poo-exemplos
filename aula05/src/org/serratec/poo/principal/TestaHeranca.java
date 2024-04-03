package org.serratec.poo.principal;

import java.time.LocalDate;

import org.serratec.poo.classes.Aluno;
import org.serratec.poo.classes.Pessoa;
import org.serratec.poo.classes.Professor;

public class TestaHeranca {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Jacqueline", 
				"123.456.145-45", LocalDate.of(2000, 9, 8));
		System.out.println(pessoa1);
		
		Aluno aluno1 = new Aluno("Maurício", "987.555.774-88",
				LocalDate.of(1980, 1, 20), "999988888");
		System.out.println(aluno1);
		
		Professor professor1 = new Professor("Fernando", "987.555.774-88",
				LocalDate.of(1980, 1, 20), "333333333");
		professor1.setDisciplina("POO");
		System.out.println(professor1);
		
	}
	

}
