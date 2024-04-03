package org.serratec.poo.classes;

public class Pessoa {
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	private double imc;
	
	//getter = deixa outra classe ver o conteúdo da forma
	//que tiver programado no método
	
	//setter = deixa inserir valor pro atributo com suas
	//devidas proteções
	
	
	public Pessoa(String nome, double peso, double altura) {
		this.nome = nome;
		//this.peso = peso;		
		setPeso(peso);
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade < 1) {
			System.out.println("Idade tem que ser informada");
			return;
		}
		
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}
	
	
	public double getImc() {
		imc = calculaImc();
		return imc;
	}

	public double calculaImc() {
		return peso / (altura * altura);
	}
	
	public void imprimeImc() {
		System.out.printf("Imc da pessoa %.2f", calculaImc());
	}

}
