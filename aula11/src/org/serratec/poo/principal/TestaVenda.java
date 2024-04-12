package org.serratec.poo.principal;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.serratec.poo.classes.AlteracaoPreco;
import org.serratec.poo.classes.Produto;
import org.serratec.poo.classes.Venda;

public class TestaVenda {
	public static void main(String[] args) {
		Produto produto1 = new Produto("Coca-Cola 2L", 12.80);
		Produto produto2 = new Produto("Batata Palha 200g", 7.40);
		Produto produto5 = new Produto("Fubá Tio João", 1800.00);
		
		AlteracaoPreco alteracao1 = new AlteracaoPreco(LocalDate.of(2024, 4, 11), 5);
		
		Produto produto3 = new Produto("Feijao", 4.99);
		Produto produto4 = new Produto("Arroz Tio João", 6.99);

		Venda venda2 = new Venda(LocalDate.of(2024, 05, 14));

		AlteracaoPreco alteracao2 = new AlteracaoPreco(LocalDate.of(2024, 05, 14), 0.5);
		venda2.adicionaProduto(produto3);
		venda2.adicionaProduto(produto4);
		venda2.adicionaProduto(produto2);
		venda2.adicionaProduto(produto1);
		venda2.adicionaProduto(produto5);
		venda2.getProdutos().get(1).alteraPrecoDoProduto(alteracao1);
		
		System.out.println(venda2);
		System.out.println("=============================");
		
		List<Produto> produtosOrdenados = venda2.getProdutos().stream()
				.sorted(Comparator.comparing(Produto::getDescricao))
				.toList();
		
		System.out.println("\nProdutos ordenados por nome");
		produtosOrdenados.forEach(System.out::println);
		
		System.out.println("=============================");
		
		List<Produto> produtosOrdenados2 = venda2.getProdutos().stream()
				.sorted(Comparator.comparingDouble(Produto::getValor).reversed())
				.toList();
		
		
		System.out.println("\nProdutos ordenados por valor");
		produtosOrdenados2.forEach(System.out::println);
		
		System.out.println("=============================");
		
		List<Produto> produtosAbaixoPreco = venda2.getProdutos().stream()
				.filter(produto -> produto.getValor() < 5)
				.toList();
		
		System.out.println("\nProdutos abaixo de R$ 5,00");
		produtosAbaixoPreco.forEach(System.out::println);
		
		System.out.println("=============================");
		
		List<Produto> produtosPorMarca = venda2.getProdutos().stream()
				.filter(produto -> produto.getDescricao().contains("Tio João"))
				.toList();
		
		System.out.println("\nProdutos Tio João");
		produtosPorMarca.forEach(System.out::println);
		
		System.out.println("=============================");	
	}
}
