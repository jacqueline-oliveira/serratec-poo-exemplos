package org.serratec.poo.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.serratec.poo.classes.Funcionario;
import org.serratec.poo.classes.Gerente;
import org.serratec.poo.classes.Vendedor;

public class TestaFuncionario {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		Funcionario funcionario = null;
		int opcao = -1;
		List<Funcionario> funcionarios = new ArrayList<>(); 
		
		while (opcao != 3) {
			String mensagem = """
					Escolha uma opção
					1 - cadastrar um gerente
					2 - cadastrar um vendedor
					3 - sair
					""";
			System.out.println(mensagem);
			opcao = leitura.nextInt();
			leitura.nextLine();
			
			String nome = "";
			double salario = 0.0;
			
			if (opcao != 3) {
				System.out.println("Digite o nome");
				nome = leitura.nextLine();
				System.out.println("Digite o salário");
				salario = leitura.nextDouble();
			}
			
			if (opcao == 1) {
				funcionario = new Gerente(nome, salario);		
			} else if (opcao == 2) {
				funcionario = new Vendedor(nome, salario);			
			} else {
				System.out.println("\nListagem de funcionários: \n");
			}
			
			if (opcao != 3) {
				System.out.println(funcionario);
				System.out.println("Digite um percentual de reajuste: ");
				var valorReajuste = leitura.nextDouble();
				funcionario.reajustaSalario(valorReajuste);	
				funcionarios.add(funcionario);
			}
		}
		
		if (opcao == 3) {
			for (Funcionario f : funcionarios) {
				System.out.println(f);
			}
		}
			
		leitura.close();
	}
}
