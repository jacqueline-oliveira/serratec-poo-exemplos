package org.serratec.poo.classes;

import java.time.LocalDate;

public class AlteracaoPreco {
	private LocalDate data;
	private double percentual;
	
	public AlteracaoPreco(LocalDate data, double percentual) {
		this.data = data;
		this.percentual = percentual;
	}

	public LocalDate getData() {
		return data;
	}

	public double getPercentual() {
		return percentual;
	}

	@Override
	public String toString() {
		return "Reajuste em " + data + ", percentual " + percentual;
	}
}
