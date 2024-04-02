package org.serratec.poo.classes;

public class Veiculo {
	private String marca;
	private String modelo;
	private int ano;
	private String categoria;
	private String placa;
	private String cor;
		
		
	public Veiculo(String marca, int ano, String placa) {
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPlaca() {
		return placa;
	}


	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		if(marca.trim().isBlank()) {
			System.out.println("Não pode ficar sem marca");
			return;
		}
		
		this.marca = marca;
	}
	
	public void imprimeMarca() {
		if (marca == null) {
			System.out.println("Não foi informado nenhuma marca");
		} else {
			System.out.println("Marca: " + marca);	
		}	
	}

	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", categoria=" + categoria
				+ ", placa=" + placa + ", cor=" + cor + "]";
	}
	
	public void imprimeDadosCarro() {
		System.out.println(marca + ", modelo " + modelo + ", ano " + ano + 
				", cor=" + cor);
	}
	
	public static void dizerOi() {
		System.out.println("Oi");
	}
		

}
