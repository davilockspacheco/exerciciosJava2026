/*
Menu de Frutas:Crie um programa que exiba um menu com 5 frutas 
(1 – Maçã, 2 – Banana, 3 – Laranja, 4 – Uva, 5 – Pêra) e mostre a fruta escolhida pelo usuário.

*/

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Menu de opções");
        System.out.println("1 - Maçã ");
        System.out.println("2 - Banana");
        System.out.println("3 - Laranja");
        System.out.println("4 - Uva");
        System.out.println("5 - Pêra");
        System.out.println("Escolha uma opção: ");
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.println("Voce escolher a maçã");
                break;
            case 2:
                System.out.println("Voce escolher a Banana");
                break;
            case 3:
                System.out.println("Voce escolher a Laranja");
                break;
            case 4:
                System.out.println("Voce escolher a uva");
                break;
            case 5:
                System.out.println("Voce escolher a pêra");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
