// 3) Crie um programa em JAVA que mostre na tela as opções de um Conversor de Moedas. 
// O usuário deve informar um valor e após escolher a conversão desejada. 
// Ao final, mostrar resultado e voltar ao MENU para nova escolha se desejar:
// Peça um valor em reais e escolha a conversão:
// Dólar
// Euro
// Libra


package ExerciciosRepeticao;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(;;){
            System.out.println("Menu de opções");
            System.out.println("1 - Dólar");
            System.out.println("2 - Euro");
            System.out.println("3 - Libra");
            System.out.println("Escolha uma opção para converter seu valor em reais: ");
            int opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Digite seu valor em reais para converter em Dólar: ");
                    double dolar = scanner.nextDouble();
                    System.out.println("Valor em dolares é: " + (dolar / 5.24));
                    break;
                case 2:
                    System.out.println("Digite seu valor em reais para converter em Dólar: ");
                    double euro = scanner.nextDouble();
                    System.out.println("Valor em dolares é: " + (euro / 6.05));
                    break;
                case 3:
                    System.out.println("Digite seu valor em reais para converter em Dólar: ");
                    double libra = scanner.nextDouble();
                    System.out.println("Valor em dolares é: " + (libra / 7.02));
                    break;
            
                default:
                    System.out.println("Saindo do sistema");
                    break;
            }

        }
    }
}
