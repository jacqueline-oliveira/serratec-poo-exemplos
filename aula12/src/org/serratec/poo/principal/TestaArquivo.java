package org.serratec.poo.principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.serratec.poo.classes.Pessoa;

public class TestaArquivo {

	public static void main(String[] args)   {
	List<Pessoa> pessoas = new ArrayList<>();	
		
	try {
		BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"));
		
		while(br.ready()) {
			String linha = br.readLine();
			String[] partes = linha.split(";");
			String nome = partes[0];
			LocalDate nascimento = LocalDate.parse(partes[1]);
			String cpf = partes[2];
			
			Pessoa pessoa = new Pessoa(nome, nascimento, cpf);
			pessoas.add(pessoa);
		}
		
		br.close();
		
	} catch (FileNotFoundException e) {
		System.out.println("Erro original: " + e.getMessage());
	} catch (IOException e) {
		System.out.println("Erro lendo o arquivo " + e.getMessage());
	}
	
	//ordenem a lista alfabeticamente
	Collections.sort(pessoas);
	pessoas.forEach(System.out::println);	
		
	}

}
