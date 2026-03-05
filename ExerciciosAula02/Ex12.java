/*
Calculadora de Média:Permita que o usuário escolha entre calcular a 
média de 2, 3 ou 4 notas. Peça as notas correspondentes e mostre a média.

*/

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu de opções");
        System.out.println("Escolha qunatas notas deseja calcular a média");
        System.out.println("1 - 2 notas ");
        System.out.println("2 - 3 notas");
        System.out.println("3 - 4 notas");
        System.out.println("Escolha uma opção: ");
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.println("Digite a nota 1");
                double nota1 = scanner.nextDouble();
                System.out.println("Digite a nota 2");
                double nota2 = scanner.nextDouble();
                double media = (nota1+nota2) /2;
                System.out.println("Média: " +media);
                break;
            case 2:
                System.out.println("Digite a nota 1");
                double nota3 = scanner.nextDouble();
                System.out.println("Digite a nota 2");
                double nota4 = scanner.nextDouble();
                System.out.println("Digite a nota 3");
                double nota5 = scanner.nextDouble();
                double media2 = (nota3+nota4+nota5) /3;
                System.out.println("Média: " +media2);
                break;
            case 3:
                System.out.println("Digite a nota 1");
                double nota6 = scanner.nextDouble();
                System.out.println("Digite a nota 2");
                double nota7 = scanner.nextDouble();
                System.out.println("Digite a nota 3");
                double nota8 = scanner.nextDouble();
                System.out.println("Digite a nota 5");
                double nota9 = scanner.nextDouble();
                double media3 = (nota6+nota7+nota8+nota9) /4;
                System.out.println("Média: " +media3);
                break;
        
            default:
                System.out.println("Erro");
                break;
        }
    }
}
