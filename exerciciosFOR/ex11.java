package exerciciosFOR;
//O usuário digita vários números e o programa soma. Quando digitar 0, o programa finaliza

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for (;;) {

            System.out.println("Digite um numero: ");
            double numero = scanner.nextDouble();

            if (numero == 0) {
                System.out.println("Encerrando o programa");
                break;
            }
            soma = soma + numero;
        }
        System.out.println("Soma total: " + soma);
        scanner.close();
    }
}