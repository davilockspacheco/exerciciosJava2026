/*
Conversor de Temperatura:Exiba um menu:
 1 – Celsius para Fahrenheit, 2 – Fahrenheit para Celsius. Pergunte a temperatura e mostre a conversão.

*/

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu de opções");
        System.out.println("Escolha uma operação");
        System.out.println("1 - Celsius para Fahrenheit ");
        System.out.println("2 - Fahrenheit para Celsius");
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
                System.out.println("Digite a temperatura em Celsius");
                double tempFa = scanner.nextDouble();
                double tempCe =(tempFa - 32) * 5.0 / 9.0;
                System.out.println(tempCe);
                break;

            default:
                System.out.println("Erro");
                break;
        }
    }
}
