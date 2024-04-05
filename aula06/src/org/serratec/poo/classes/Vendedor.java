package org.serratec.poo.classes;

public class Vendedor extends Funcionario {
	private double percComissao;
	private double totalVendas;

	public Vendedor(String nome, double salario) {
		super(nome, salario);
	}

	public double getPercComissao() {
		return percComissao;
	}

	public void setPercComissao(double percComissao) {
		this.percComissao = percComissao;
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	@Override
	public String toString() {
		return super.toString() + " percentual comissão=" 
				+ percComissao + ", totalVendas=" + totalVendas +
				" é um vendedor.";
	}

}
