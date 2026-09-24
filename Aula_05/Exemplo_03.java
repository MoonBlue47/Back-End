package Aula_05; 

import java.util.Scanner;

public class Exemplo_03 { //Tabuada

	public static void main(String[] args) throws InterruptedException {
		int cont = 0;
		int numero;
		int total;
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		numero = ler.nextInt();
		
		while (cont<11) {
			total = numero * cont;
			System.out.println(numero+" X "+cont+" : "+total);
			Thread.sleep(1000); //ver a execusão devagar
			cont++;
		}
		ler.close();
	}

}
