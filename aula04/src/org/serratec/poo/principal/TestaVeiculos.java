package org.serratec.poo.principal;

import org.serratec.poo.classes.Veiculo;

public class TestaVeiculos {
	public static void main(String[] args) {
		Veiculo uno = new Veiculo("Fiat", 2020, "tpj-9087");
		uno.setModelo("Uno 1.6");
		uno.setCor("Branco");
		uno.imprimeMarca();
		System.out.println(uno);
		uno.imprimeDadosCarro();
		
		Veiculo.dizerOi();
	}

}

//cria novo Java project chamado aula04
//cria um package chamado org.serratec.poo.classes
//dentro desse package cria a classe Veiculo
//cria um package chamado org.serratec.poo.principal
//dentro desse package cria a classe TestaVeiculos