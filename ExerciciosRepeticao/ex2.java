// 2) Crie um programa em JAVA que mostre na tela as opções de um Conversor de temperatura. 
// O usuário deve informar uma temperatura e após escolher a conversão desejada. 
// Ao final, mostrar resultado e voltar ao MENU para nova escolha se desejar: 
// Peça um valor e escolha:
// Celsius → Fahrenheit
// Fahrenheit → Celsius
// Celsius → Kelvin


package ExerciciosRepeticao;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(;;){
            System.out.println("Menu de opções");
        System.out.println("1 - Celsius para Fahrenheit ");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.println("2 - Celsius para Kelvin");
        System.out.println("Escolha uma opção: ");
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.println("Digite a temperatura em Celsius");
                double tempC = scanner.nextDouble();
                double tempF = (tempC * 1.8) + 32;
                System.out.println(tempF);
                break;
            case 2:
                System.out.println("Digite a temperatura em Fahrenheit");
                double tempFa = scanner.nextDouble();
                double tempCe =(tempFa - 32) * 5.0 / 9.0;
                System.out.println(tempCe);
                break;
            case 3: 
                System.out.println("Digite a temperatura em Celsius");
                double tempCel = scanner.nextDouble();
                double tempK = tempCel  + 273.15;
                System.out.println(tempK);
                break;
            default:
                System.out.println("Erro");
                break;
        }
        }
    }
}
