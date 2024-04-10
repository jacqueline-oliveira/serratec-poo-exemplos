package org.serratec.poo.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaLista {
	public static void main(String[] args) {
		List<String> linguagens = new ArrayList<>();
		linguagens.add("Java");
		linguagens.add("JavaScript");
		linguagens.add("Python");
		linguagens.add("C++");
		linguagens.add("Lua");
		linguagens.add("Cobol");
		linguagens.add("Delphi");
		
		for (String item : linguagens) {
			System.out.println(item);
		}
		
		System.out.println("\nTamanho da lista: " + linguagens.size());
		System.out.println("\n");
		
		linguagens.addFirst("Portugol");
		linguagens.add(3, "Lua");
		System.out.println("\n");
		linguagens.remove("C++");
		
		Collections.sort(linguagens);
		
		for (String item : linguagens) {
			System.out.println(item);
		}
		
		
		
	}

}
