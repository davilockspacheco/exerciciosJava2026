//1) Calculadora com menu
// Criar um programa JAVA que contenha métodos para: somar, subtrair, multiplicar e dividir.   
// O programa deve pedir ao usuário dois números e a operação desejada. Após calcular e mostrar resultado da operação.

package Metodos;

import java.util.Scanner;

public class ex1 {
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro, divisao por 0");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        double resultado = 0;
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.println("Menu de opções");
            System.out.println("1  Somar ");
            System.out.println("2  Subtrair ");
            System.out.println("3  Multiplicar ");
            System.out.println("4  Dividir ");
            System.out.println("5  Sair ");
            System.out.print("Opção: ");
            int opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Digite o primeiro numero: ");
                    double numSoma = scanner.nextDouble();
                    System.out.println("Digite o segundo numero: ");
                    double num2Soma = scanner.nextDouble();
                    resultado = somar(numSoma, num2Soma);
                    System.out.println("O resultado da soma é: " + resultado);
                    break;
                case 2:
                    System.out.println("Digite o primeiro numero: ");
                    double numSubtracao = scanner.nextDouble();
                    System.out.println("Digite o segundo numero: ");
                    double num2Subtracao = scanner.nextDouble();
                    resultado = subtrair(numSubtracao, num2Subtracao);
                    System.out.println("O resultado da subtração é: " + resultado);
                    break;                                                                                                    
                case 3:
                    System.out.println("Digite o primeiro numero: ");
                    double numMultiplicacao = scanner.nextDouble();
                    System.out.println("Digite o segundo numero: ");
                    double num2Multiplicacao = scanner.nextDouble();
                    resultado = multiplicar(numMultiplicacao, num2Multiplicacao);
                    System.out.println("O resultado da Multiplicacao é: " + resultado);
                    
                case 4:
                    System.out.println("Digite o primeiro numero: ");
                    double numDivisao = scanner.nextDouble();
                    System.out.println("Digite o segundo numero: ");
                    double num2Divisao = scanner.nextDouble();
                    resultado = dividir(numDivisao, num2Divisao);
                    System.out.println("O resultado da Divisao é: " + resultado);
                    break;
                case 5:
                    System.out.println("Saindo do sistema");
                    scanner.close();
                    break;
                default:
                    System.out.println("Erro");
                    break;
            }

        }

    }
}
