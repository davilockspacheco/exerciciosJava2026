// 3. Fatorial de um número
// Crie um programa JAVA que contenha uma função que calcule o fatorial de um número inteiro. O usuário entra com o numero e calcula.


package Metodos;

import java.util.Scanner;

public class ex3 {
    public static int fatorial(int a){
        return a * a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int num = scanner.nextInt();
        System.out.println("O fatorial é: " + fatorial(num));
        
    }
}
