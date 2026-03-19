package exerciciosFOR;
//Peça ao usuário um número entre 1 e 50. O programa deve continuar pedindo até que o usuário digite um valor inválido

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (;;) {

            System.out.println("Digite um numero de 1 a 50: ");
            int numero = scanner.nextInt();

            if (numero < 1 || numero > 50) {
                System.out.println("Número invalido, programa encerrado");
                break;
            }
        }
        scanner.close();
    }
}