package Aula_05;

import java.util.Scanner;

public class Exemplo_02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		while (true) {
			System.out.println("Digite um numero ou 0 par encerrar!");
			numero = ler.nextInt();
			if(numero == 0) {
				System.out.println("Fim");
				break;
			}
		}

		ler.close();
	}

}
