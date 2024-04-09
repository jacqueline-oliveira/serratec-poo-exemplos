package org.serratec.poo.principal;

import org.serratec.poo.classes.Funcionario;
import org.serratec.poo.classes.Gerente;
import org.serratec.poo.classes.Vendedor;

public class NovoTestaFuncinario {
	public static void main(String[] args) {
		Funcionario funcionario = new Vendedor("Mario", 3000);
		funcionario.descreveSalario();
	}

}
