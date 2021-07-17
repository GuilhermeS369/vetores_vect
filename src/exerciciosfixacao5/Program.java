package exerciciosfixacao5;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();// O QUE VAI RECEBER O NUMERO DE VERZES Q VAI SER INSTANCIADO
		Product[] vect = new Product[n]; // INSTANCIA
		
		for(int i=0; i<n; i++) { // FOR PARA FAZER O CORRE TODAS AS VEZES
			sc.nextLine(); // PULAR LINHA 
			String product = sc.nextLine(); // O PRIMEIRO CORRE É ESSE 
			double price = sc.nextDouble();// ESSE VAI RECEBER O PREÇO DO PRODUTO
			vect[i] = new Product(product, price); // AQUI É O COMANDO QUE INSTANCIA VARIAS VEZES E 
													//RECEBE OS DOIS E SALVA NUMA POSIÇÃO NA MEMORIA
			
		}
		
		
		double sum = 0.0;
		for (int i=0; i<n; i++) {
			
			sum  += vect[i].getPrice();
		 	
		
		}
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
