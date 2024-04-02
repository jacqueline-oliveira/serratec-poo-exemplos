package org.serratec.poo;

import org.serratec.poo.classes.Calcado;
import org.serratec.poo.classes.Endereco;
import org.serratec.poo.classes.Vendedor;

public class Exercicio02 {
	public static void main(String[] args) {
		Calcado sandalia = new Calcado("Rasteira", 36, 59.90);
		
		sandalia.tipo = "Sandália rasteira";
		sandalia.estilo = "feminino";
		sandalia.tamanho = 37;
		sandalia.modelo = "    ";
		sandalia.cor = "rosa";
		sandalia.valor = 79.90;
		
		System.out.println(sandalia);
		
		Vendedor vendedor = new Vendedor("Jacqueline", "123456", 
				   new Endereco("Rua abc", 123, "Whatever", "12345-999"));
		
		System.out.println(vendedor);	
	}
}
