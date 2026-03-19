// Crie um programa em JAVA que mostre na tela as opções de ingressos em um Cinema. 
// Mostre um menu com os tipos:
// 1 - Inteira (R$20)
// 2 - Meia (R$10)
// 3 - VIP (R$35)
// 4 - Combo pipoca + refri (R$15)
// Após o usuário escolhe o código e a quantidade. Calcular o total e mostrar. 
// O sistema deve voltar ao MENU para nova escolha se desejar. Ao encerrar programa exibir o total faturamento.

package ExerciciosRepeticao;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;

        for (;;) {
            System.out.println("\n----- MENU -----              ");
            System.out.println("1 -Inteira (R$20)               ");
            System.out.println("2 - Meia (R$10)                 ");
            System.out.println("3 - VIP (R$35)                  ");
            System.out.println("4 - Combo pipoca + refri (R$15) ");
            System.out.println("0 - Encerrar                    ");
            System.out.println("\n Escolha o Ingresso:          ");

            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Digite a quantidade de ingressos inteiros: ");
                int quantidade_inteira = scanner.nextInt();

                System.out.println("O total dos Ingressos é: " + (quantidade_inteira * 20));
                total += quantidade_inteira * 20;

            } 
            else if (opcao == 2) {
                System.out.println("Digite a quantidade de ingressos Meia Entrada: ");
                int quantidade_meia = scanner.nextInt();

                System.out.println("O total dos ingressos é: " + (quantidade_meia * 10));
                total += quantidade_meia * 10;

            } 
            else if (opcao == 3) {
                System.out.println("Digite a quantidade de ingressos Vips: ");
                int quantidade_vip = scanner.nextInt();

                System.out.println("O total dos ingressos é: " + (quantidade_vip * 35));
                total += quantidade_vip * 35;
            } 
            else if (opcao == 4) {
                System.out.println("Digite a quantidade de Combos de Pipoca e Refrigerante: ");
                int quantidade_combo = scanner.nextInt();

                System.out.println("O total dos Hamburgueres é: " + (quantidade_combo * 15));
                total += quantidade_combo * 15;

            } 
            else if (opcao == 0) {
                System.out.println("Encerrando o Sistema.......");
                System.out.println("Total Faturado: " + total);
                scanner.close();
                break;

            } else {
                System.out.println("Erro tente novamente");
            }
        }
    }

}
