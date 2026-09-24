package Desafio;

import java.util.Scanner;

public class Desafio_02 {

	public static void main(String[] args) {
		Scanner ver = new Scanner(System.in);

        // 1. Entrada de Dados: Escolha do Nível
        System.out.println("--- Escola Tio Sam de Idiomas ---");
        System.out.println("Níveis disponíveis:");
        System.out.println("1 - Nível I (R$ 51,50)");
        System.out.println("2 - Nível II (R$ 65,00)");
        System.out.println("3 - Nível III (R$ 80,00)");
        System.out.println("4 - Nível IV (R$ 100,00)");
        System.out.print("Digite o número do nível do aluno (1 a 4): ");
        int nivel = ver.nextInt();

        // Variável para armazenar a mensalidade base
        double mensalidadeBase = 0.0;
        String nomeNivel = "";

        // Verificando qual nível foi escolhido usando 'switch'
        switch (nivel) {
            case 1:
                mensalidadeBase = 51.50;
                nomeNivel = "Nível I";
                break;
            case 2:
                mensalidadeBase = 65.00;
                nomeNivel = "Nível II";
                break;
            case 3:
                mensalidadeBase = 80.00;
                nomeNivel = "Nível III";
                break;
            case 4:
                mensalidadeBase = 100.00;
                nomeNivel = "Nível IV";
                break;
            default:
                System.out.println("Nível inválido! Encerrando o programa.");
                System.exit(0);
        }

        // 2. Entrada de Dados: Dia do pagamento
        System.out.print("Digite o dia do pagamento (ex: 1, 5, 10...): ");
        int diaPagamento = ver.nextInt();

        // Variável para armazenar a taxa de desconto
        double percentualDesconto = 0.0;

        // 3. Regra de Negócio (Descontos)
        if (diaPagamento <= 1) {
            percentualDesconto = 0.15;   // 15% de desconto
        } else if (diaPagamento <= 5) {
            percentualDesconto = 0.10;   // 10% de desconto
        } else if (diaPagamento <= 10) {
            percentualDesconto = 0.0389; // 3,89% de desconto
        } else {
            percentualDesconto = 0.0;    // Sem desconto após o dia 10
        }

        // 4. Cálculos Finais
        double valorDesconto = mensalidadeBase * percentualDesconto;
        double valorFinal = mensalidadeBase - valorDesconto;

        // 5. Saída de Dados
        System.out.println("\n--- Recibo de Pagamento ---");
        System.out.println("Curso:            " + nomeNivel);
        System.out.printf("Valor Base:       R$ %.2f\n", mensalidadeBase);
        System.out.printf("Desconto Aplicado: %.2f%%\n", (percentualDesconto * 100));
        System.out.printf("Valor do Desconto: R$ %.2f\n", valorDesconto);
        System.out.printf("Valor Final:      R$ %.2f\n", valorFinal);

        ver.close();


	}

}
