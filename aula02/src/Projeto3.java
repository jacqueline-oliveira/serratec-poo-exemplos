

public class Projeto3 {

	public static void main(String[] args) {
		String produto1 = "Microfone";
		String produto2 = "Mouse";
		String produto3 = "Teclado";

		double preco1 = 178.90;
		double preco2 = 59.90;
		double preco3 = 199.998;
		
		int quantidade1 = 2;
		int quantidade2 = 10;
		int quantidade3 = 5;
				
		double total1 = preco1 * quantidade1; 
		double total2 = preco2 * quantidade2; 
		double total3 = preco3 * quantidade3; 
		
		System.out.printf("\nProduto: %s - quantidade: %s - total R$ %s",
				produto1, quantidade1, total1);
		System.out.printf("\nProduto: %s - quantidade: %s - total R$ %s",
				produto2, quantidade2, total2);
		System.out.printf("\nProduto: %s - quantidade: %s - total R$ %.2f",
				produto3, quantidade3, total3);
		
		System.out.printf("\nValor total com desconto R$ %.2f" , 
		   (total1 + total2 + total3) /100 * 90);
	

	}

}
