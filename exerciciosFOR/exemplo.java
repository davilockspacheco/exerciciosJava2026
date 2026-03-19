package exerciciosFOR;

import java.util.Scanner;

public class exemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        for (; numero < 1 || numero > 10;) {
            System.out.print("Digite um numero entre 1 e 10: ");
            numero = scanner.nextInt();
        }
        System.out.println("Você digitou: " + numero);
        
        scanner.close();
    }   
}