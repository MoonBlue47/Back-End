package Aula_06;

public class Exemplo_02 {

	public static void main(String[] args) throws InterruptedException {
		String[]frutas = {"Laranja", "Banana", "Maça", "Uva", "Abacate"};
		
		for(int i=0; i<frutas.length; i++) {
			System.out.println("Fruta: "+frutas[i]);
			Thread.sleep(1000);
		}
	}
	

}
