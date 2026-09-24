package Aula_05;

public class Exemplo_04 {

	public static void main(String[] args) throws InterruptedException {
		int cont = 0; //depende de uma resposta boleana
		
		do {
			System.out.println("Volta: "+cont);
			Thread.sleep(1000);
			cont++;
		}while (cont < 5);

	}

}
