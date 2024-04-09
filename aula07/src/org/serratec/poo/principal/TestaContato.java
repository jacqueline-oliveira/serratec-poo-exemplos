package org.serratec.poo.principal;

import java.util.ArrayList;
import java.util.List;

import org.serratec.poo.classes.Cidade;
import org.serratec.poo.classes.Contato;
import org.serratec.poo.classes.Endereco;
import org.serratec.poo.classes.Estado;
import org.serratec.poo.classes.Telefone;

public class TestaContato {
	public static void main(String[] args) {
		Contato novoContato = new Contato("Jacqueline", 
			new Endereco("Rua Abc, 123", "Tijuca", "12345-999",
			new Cidade("Teresópolis", 
			new Estado("Rio de Janeiro", "RJ"))));	
		
		Telefone tel = new Telefone("021 9988-7766");
		novoContato.adicionaTelefone(tel);
		novoContato.adicionaTelefone(new Telefone("024 6655-4433"));
		
		System.out.println(novoContato);
		
		Estado rj = new Estado("Rio de Janeiro", "RJ");
		Cidade friburgo = new Cidade("Nova Friburgo", rj);
		Endereco endereco = new Endereco("Rua A, 12", "Olaria", "12345-885", friburgo);
		Contato contato2 = new Contato("Joao", endereco);
		
		List<Telefone> telefonesDoContato2 = new ArrayList<>();
		telefonesDoContato2.add(tel);
		telefonesDoContato2.add(new Telefone("022 5566-9988"));
		contato2.setTelefones(telefonesDoContato2);
		
		
		System.out.println(contato2);
		contato2.mostrarTelefones();
		
		
	}
}
