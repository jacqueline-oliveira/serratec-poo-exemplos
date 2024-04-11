package org.serratec.poo.classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda {
	private LocalDate data;
	private List<Produto> produtos = new ArrayList<>();
	private double valorTotal;
	
	
	public Venda(LocalDate data) {
		super();
		this.data = data;
	}


	public LocalDate getData() {
		return data;
	}


	public List<Produto> getProdutos() {
		return produtos;
	}


	public double getValorTotal() {
		valorTotal = 0;
		
		for (Produto produto : produtos) {
			valorTotal += produto.getValor();
		}
		
		return valorTotal;
	}
	
	public void adicionaProduto(Produto produto) {
		this.produtos.add(produto);
	}


	@Override
	public String toString() {
		return data + " produtos: " + produtos + "\n Valor Total: " + getValorTotal();
	}
	
}
