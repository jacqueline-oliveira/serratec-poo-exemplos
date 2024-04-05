package org.serratec.poo.classes;

public class Gerente extends Funcionario {
	private double plr;
	private int qtdFuncionarioDepto;
	
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	public double getPlr() {
		return plr;
	}

	public void setPlr(double plr) {
		this.plr = plr;
	}

	public int getQtdFuncionarioDepto() {
		return qtdFuncionarioDepto;
	}

	public void setQtdFuncionarioDepto(int qtdFuncionarioDepto) {
		this.qtdFuncionarioDepto = qtdFuncionarioDepto;
	}

	@Override
	public String toString() {
		return super.toString() + " plr=" + plr + 
				", qtdFuncionarioDepto=" + qtdFuncionarioDepto + 
				" é um gerente.";
	}
	
	@Override
	public void reajustaSalario() {
	   salario += 500;
	}
	
	@Override
	public void reajustaSalario(double percentual) {
		super.reajustaSalario(percentual);
		salario += 1000;
	}
	
}
