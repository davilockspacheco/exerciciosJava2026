/*
Bônus Salarial (Operador Ternário): Leia o salário de um funcionário. 
Se for menor que R$ 2.000,00, o bônus é de 15%; se for maior, é de 10%. 
Use o ternário para o cálculo.
*/

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salario: ");
        double salario = scanner.nextDouble();
        double quinze = salario * 0.15;
        double dez = salario * 0.10;

        if(salario <= 2000){
            System.out.println("Bonus de 15%: " + (salario + quinze));
        }
        else if(salario > 2000){
            System.out.println("Bonus de 10%: " + (salario + dez));
        }else{
            System.out.println("Opção invalida");
        }
    }
}
