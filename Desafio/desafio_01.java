package Desafio;

import java.util.Scanner;

public class Desafio_01 {

	public static void main(String[] args) {
		// Criação do objeto Scanner para ler os dados digitados pelo usuário
        Scanner scanner = new Scanner(System.in);

        // 1. Entrada de Dados
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário atual (R$): ");
        double salario = scanner.nextDouble();

        double aumento; // Variável para guardar o valor do aumento

        // 2. Regra de Negócio (Cálculo do Aumento)
        if (salario <= 1000.00) {
            aumento = salario * 0.40; // Aumento de 40%
        } else {
            aumento = salario * 0.30; // Aumento de 30%
        }

        // 3. Cálculo do Novo Salário
        double novoSalario = salario + aumento;

        // 4. Saída de Dados
        System.out.println("\n--- Folha de Pagamento ---");
        System.out.println("Nome: " + nome);
        // O printf com "%.2f" formata o número para ter apenas 2 casas decimais
        System.out.printf("Salário Original: R$ %.2f\n", salario);
        System.out.printf("Aumento:          R$ %.2f\n", aumento);
        System.out.printf("Novo Salário:     R$ %.2f\n", novoSalario);

        // Fechando o scanner
        scanner.close();
  }
}