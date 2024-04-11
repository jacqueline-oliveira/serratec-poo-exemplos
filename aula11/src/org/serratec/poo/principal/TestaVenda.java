package org.serratec.poo.principal;

import java.time.LocalDate;

import org.serratec.poo.classes.AlteracaoPreco;
import org.serratec.poo.classes.Produto;
import org.serratec.poo.classes.Venda;

public class TestaVenda {
	public static void main(String[] args) {
		Produto tenis1 = new Produto("Tênis Nike Air", 120.20);
		Produto produto1 = new Produto("Coca-Cola 2L", 12.80);
		Produto produto2 = new Produto("Batata Palha 200g", 7.40);
		Produto produto5 = new Produto("Sofá", 1800.00);
		
		Venda venda1 = new Venda(LocalDate.of(2024, 04, 11));
		
		AlteracaoPreco alteracao1 = new AlteracaoPreco(LocalDate.of(2024, 4, 11), 5);
		
		venda1.adicionaProduto(produto1);
		venda1.adicionaProduto(produto5);
		venda1.getProdutos().get(1).alteraPrecoDoProduto(alteracao1);
		System.out.println(venda1);
		
		
		Produto produto3 = new Produto("Feijao", 4.99);
		Produto produto4 = new Produto("Arroz", 6.99);

		Venda venda2 = new Venda(LocalDate.of(2024, 05, 14));

		AlteracaoPreco alteracao2 = new AlteracaoPreco(LocalDate.of(2024, 05, 14), 0.5);
		venda2.adicionaProduto(produto3);
		venda2.adicionaProduto(produto4);
		venda2.getProdutos().get(1).alteraPrecoDoProduto(alteracao1);
		
		System.out.println(venda2);
		
	}

}
