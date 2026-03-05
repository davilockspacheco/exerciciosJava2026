/*Calculadora Básica (switch-case): 
Receba dois números e um caractere (+, -, *, /). Use o switch para realizar a operação correspondente.
 */

import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double num = scanner.nextDouble();
        System.out.println("Digite outro numero: ");
        double num2 = scanner.nextDouble();
        System.out.println("Menu de opções");
        System.out.println("1 - Somar ");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Muntiplicar");
        System.out.println("4 - Dividir");
        System.out.println("Escolha uma opção: ");
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.println(num+num2);
                break;
            case 2:
                System.out.println(num-num2);
                break;
            case 3:
                System.out.println(num*num2);
                break;
            case 4:
                System.out.println(num/num2);
                break;
            default:
                System.out.println("Digite uma opção válida");
                break;
        }
    }
}
