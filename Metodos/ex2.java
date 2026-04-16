// 2. Verificar número primo
// Crie um programa JAVA que contenha uma função que receba um número inteiro e retorne se ele é primo ou não.


package Metodos;

import java.util.Scanner;

public class ex2 {
    public static boolean verificar(double a){
        if(a <= 0){
            return false;
        }
        for (int i = 2; i <= a/2; i++){
            if (a % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double num = scanner.nextDouble();

        if(verificar(num)){
            System.out.println("O numero " + num + " é primo.");
        }else{
            System.out.println("O numero " + num + " nao é primo.");
        }
        scanner.close();
    }
}
