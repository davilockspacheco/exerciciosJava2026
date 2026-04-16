// 5. Tabuada de um número
// Crie um programa JAVA que contenha uma função que receba um número e imprima a tabuada dele de 1 a 10.


package Metodos;

import java.util.Scanner;

public class ex5 {
    public static void calcular(int numero){
        System.out.println("Tabuada: ");
        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();
        calcular(num);
        scanner.close();
    }

}
