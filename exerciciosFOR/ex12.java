package exerciciosFOR;
//O usuário digita um numero. Calcula e mostra o FATORIAL do numero escolhido

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }

        System.out.println("Fatorial de " + numero + " é: " + fatorial);

        scanner.close();
    }
}
