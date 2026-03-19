package exerciciosFOR;

import java.util.Scanner;

//Peça ao usuário 5 números e mostre a soma total deles
public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o numero: ");
            double numero = scanner.nextDouble();

            soma = soma + numero;

            scanner.nextLine();

        }
        System.out.println("Total da soma: " + soma);
        scanner.close();
    }
}
