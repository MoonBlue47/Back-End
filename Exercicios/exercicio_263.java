package Exercicio_05;

import java.util.Scanner;

public class Correcao_263 {

	public static void main(String[] args) {
		int cont = 0;
		int num;
		Scanner r2d2 = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		num = r2d2.nextInt();	
		
		while (true) {
			
			if(num>0) {
				cont = cont + 1;
			}else {
				System.out.println("Fim");
				break;
			}
			
			System.out.println("Digite um numero: ");
			num = r2d2.nextInt();
		} 
		System.out.println("Numeros digitados: "+cont);

		r2d2.close();
	}

}
