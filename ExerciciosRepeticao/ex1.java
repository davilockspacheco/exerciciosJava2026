// Crie um programa em JAVA que mostre na tela as opções de uma Calculadora avançada. 
// O usuário deve informar dois números e após escolher a operação desejada. Ao final, 
// mostrar resultado e voltar ao MENU para nova escolha se desejar:

// Operações Matemáticas:   Soma     Subtração    Multiplicação     Divisão   Potência

package ExerciciosRepeticao;

import java.math.*;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            System.out.println("MENU DE OPÇÕES");
            System.out.println(" 1 - Soma");
            System.out.println(" 2 - Subtração");
            System.out.println(" 3 - Multiplicação");
            System.out.println(" 4 - Divisão");
            System.out.println(" 5 - Potência");
            System.out.println(" 6 - Sair");

            System.out.println("Escolha uma opção: ");
            int opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Digite o primeiro valor da soma: ");
                    double soma1 = scanner.nextDouble();
                    System.out.println("Digite o segundo valor da soma: ");
                    double soma2 = scanner.nextDouble();
                    double resultadoSoma = soma1 + soma2;
                    System.out.println("O resultado da soma é " + resultadoSoma);
                    break;
                case 2:
                    System.out.println("Digite o primeiro valor da subtração: ");
                    double subtracao1 = scanner.nextDouble();
                    System.out.println("Digite o segundo valor da subtração: ");
                    double subtracao2 = scanner.nextDouble();
                    double resultadoSubtracao = subtracao1 - subtracao2;
                    System.out.println("O resultado da subtração é " + resultadoSubtracao);
                    break;
                case 3:
                    System.out.println("Digite o primeiro valor da muntiplicação: ");
                    double multiplicacao1 = scanner.nextDouble();
                    System.out.println("Digite o segundo valor da muntiplicação: ");
                    double multiplicacao2 = scanner.nextDouble();
                    double resultadoMultiplicacao = multiplicacao1 * multiplicacao2;
                    System.out.println("O resultado da muntiplicação é " + resultadoMultiplicacao);
                    break;
                case 4:
                    System.out.println("Digite o primeiro valor da divisão: ");
                    double divisao1 = scanner.nextDouble();
                    System.out.println("Digite o segundo valor da divisão: ");
                    double divisao2 = scanner.nextDouble();
                    double resultadoDivisao = divisao1 / divisao2;
                    System.out.println("O resultado da divisão é " + resultadoDivisao);
                    break;
                case 5:
                    System.out.println("Digite o primeiro valor da potêncialização: ");
                    double potencia1 = scanner.nextDouble();
                    System.out.println("Digite o segundo valor da potêncialização: ");
                    double potencia2 = scanner.nextDouble();
                    double resultadoPotencia = Math.pow(potencia1, potencia2);
                    System.out.println("O resultado da potência é " + resultadoPotencia);
                    break;
                case 6:

                    System.out.println("Encerrando o sistema");
                    scanner.close();
                    break;

                default:
                    System.out.println("Digite uma opção entre 1 e 6");
                    break;

            }
        }
    }
}
