package Aula_06;

import java.util.Scanner;

public class Exemplo_04 {

	public static void main(String[] args) {
		int [][]matriz = new int[3][3];
		
		Scanner lapes = new Scanner(System.in);
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				
				System.out.println("Digite uma numero");
				matriz[linha][coluna] = lapes.nextInt();
			
			}
		}
		
		for (int linha = 0; linha < matriz.length; linha++) {
		for (int coluna = 0; coluna < matriz.length; coluna++) {
			System.out.print("|"+matriz[linha][coluna]+"|");
		   }
		System.out.println("");
	   }
	 	lapes.close();
	}
}
		
		
