package org.serratec.poo.classes;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	private String descricao;
	private double valor;
	private List<AlteracaoPreco> alteracaoPrecos = new ArrayList<>();
	
	public Produto(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}
	
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<AlteracaoPreco> getAlteracaoPrecos() {
		return alteracaoPrecos;
	}
	
	public void alteraPrecoDoProduto(AlteracaoPreco reajuste) {
		this.alteracaoPrecos.add(reajuste);
		this.valor += valor * reajuste.getPercentual() / 100;
	}

	@Override
	public String toString() {
		return "\n descrição " + descricao + ", valor: " + valor + ", reajustes: " + alteracaoPrecos;
	}
	
	

}
