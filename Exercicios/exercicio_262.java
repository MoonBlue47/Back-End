package Exercicio_05;

import java.util.Scanner;

public class Algoritimo_262 {

	public static void main(String[] args) throws InterruptedException {
		Scanner ler = new Scanner(System.in);
		int cont = 3;
		int numero;
		int total;
		
		System.out.println("Digite um numero: ");
		numero = ler.nextInt();
		
		while (cont<11) {
			total = numero * cont;
			System.out.println(numero+" X "+cont+" : "+total);
			Thread.sleep(1000); 
			cont++;
			if(total==25) {
				System.out.println("Fim");
				break;
			}
		}

		ler.close();
	} 

}
