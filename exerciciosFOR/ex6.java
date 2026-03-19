package exerciciosFOR;

//Crie um programa que mostre na tela os números de 1 até 10
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}
