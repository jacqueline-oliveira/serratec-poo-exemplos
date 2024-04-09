package org.serratec.poo.principal;

import java.util.ArrayList;
import java.util.List;

import org.serratec.poo.classes.Livro;
import org.serratec.poo.classes.Opcao;
import org.serratec.poo.classes.Operacao;
import org.serratec.poo.classes.Produto;

public class TestaInterface2 {
	public static void main(String[] args) {
		List<Opcao> acoes = new ArrayList<>();
		
		Livro livro = new Livro( "Erick Evans","Domain-Driven Design", 120); 
		Livro livro2 = new Livro("Joshua Bloch", "Java Efetivo", 220);
		Operacao operacao1 = new Operacao();
		operacao1.setLivro(livro);
		Operacao operacao2 = new Operacao();
		operacao2.setLivro(livro2);
		Produto teclado = new Produto("teclado", 79.90);
		Produto mouse = new Produto("mouse", 50);
		
		acoes.add(operacao1);
		acoes.add(operacao2);
		acoes.add(teclado);
		acoes.add(mouse);
		
//		for (Opcao item : acoes) {
//			item.emprestar();
//			System.out.println(item);
//		}
		
		for(int i = 0; i < acoes.size(); i++) {
			acoes.get(i).emprestar();
			System.out.println(acoes.get(i));
		}
			
	}

}
