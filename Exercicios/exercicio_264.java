package Exercicio_05;

import java.util.Scanner;

public class Correcao_264 {

	public static void main(String[] args) {
		double acm = 0;
		int cont = 0;
		double media;
		double num;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero positivo");
		num = ler.nextInt();	

		while (true) {
			if(num > 0) {
				acm = acm +num;
			}else {
				break;
			}
			cont++;
			System.out.println("Digite um numero posisitivo");
			num = ler.nextDouble();
		}
		media = acm/cont;
		System.out.println("Média: "+media);
		
		ler.close();
	}

}
