/*
Menu de Descontos Progressivos:Crie opções:
 1 – 5% de desconto, 2 – 10% de desconto, 3 – 15% de desconto
 . Pergunte o valor da compra e calcule o valor final com desconto.

*/

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a opção desejada: ");
        System.out.println(" 1 - 5% de desconto      ");
        System.out.println(" 2 - 10% de desconto     ");
        System.out.println(" 3 - 15% de desconto     ");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Digite o valor da compra: ");
                Double compra_opcao1 = scanner.nextDouble();
                System.out.println(
                        "Com 5% de desconto o total ficou: " + (compra_opcao1 - (compra_opcao1 * 0.05)) + " Reias");
                break;

            case 2:
                System.out.println("Digite o valor da compra: ");
                Double compra_opcao2 = scanner.nextDouble();
                System.out.println(
                        "Com 10% de desconto o total ficou: " + (compra_opcao2 - (compra_opcao2 * 0.10)) + " Reias");
                break;

            case 3:
                System.out.println("Digite o valor da compra: ");
                Double compra_opcao3 = scanner.nextDouble();
                System.out.println(
                        "Com 10% de desconto o total ficou: " + (compra_opcao3 - (compra_opcao3 * 0.15)) + " Reias");
                break;

            default:
                System.out.println("Erro: tente novamente");
                break;
        }
        scanner.close();
    }

}
