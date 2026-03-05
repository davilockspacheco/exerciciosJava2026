/*Maior de Dois Números (Operador Ternário): Receba dois números e 
use o operador ternário para imprimir qual é o maior deles em uma única linha.
 */

import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Digite um numero: ");
        double num = scanner.nextDouble();
        System.out.println("Digite outro numero: ");
        double num2 = scanner.nextDouble();

        if(num > num2){
            System.out.println("O maior número entre eles é: " + num );
        }
        else if (num < num2){
            System.out.println("O maior número entre eles é: " + num2 );
        }
        else{
            System.out.println("O número foi o mesmo" );
        }
    }
}
