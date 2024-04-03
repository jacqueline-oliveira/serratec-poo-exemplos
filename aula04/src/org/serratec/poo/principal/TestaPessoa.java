package org.serratec.poo.principal;

import org.serratec.poo.classes.Pessoa;

public class TestaPessoa {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Maria", 72, 1.69);
		double imc = pessoa.calculaImc();
		System.out.printf("Imc da pessoa %.2f", imc);
		
		pessoa.imprimeImc();
		
		System.out.println(pessoa.getImc());
		pessoa.setPeso(90);
		System.out.println(pessoa.getImc());
	
	}

}
