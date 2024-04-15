package org.serratec.poo.principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
	
	//Opções de ordenação - opção 01 atribuindo a uma variável
	//Comparator<Pessoa> comparadorPorNascimento = Comparator.comparing(Pessoa::getDataNascimento);
	//pessoas.sort(comparadorPorNascimento);
	
	//Opção 02 - fazendo direto
	//pessoas.sort(Comparator.comparing(Pessoa::getDataNascimento));
	
	pessoas.forEach(System.out::println);
	DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
	try {
		BufferedWriter bw = new BufferedWriter(new FileWriter("aquivoAjustado.txt"));
		for (Pessoa p : pessoas) {
			bw.append(p.getNome() + "|" + p.getCpf() + "|" + p.getDataNascimento().format(df) + "\n");	
		}
		bw.flush();
	    bw.close();
	} catch (IOException e) {
		System.out.println("Erro ao gravar o arquivo: " + e.getMessage());
	}
	
		
	}

}
