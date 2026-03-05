/*Par ou Ímpar (if-else): Crie um programa que 
receba um número inteiro e exiba se ele é par ou ímpar.
 */

import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = scanner.nextInt();

        if(num %2 == 0){
            System.out.println("O número " + num + " é par");
        }else{
            System.out.println("O número " + num + " é ímpar");
        }
    }
}
