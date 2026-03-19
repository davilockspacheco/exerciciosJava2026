package exerciciosFOR;

import java.util.Scanner;

//O programa pede nome e salário de 10 funcionários e calcula um bônus de 10% do salário. 
// Mostra o salário final com bônus

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double novoSalario = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Digite o nome do funcionario: ");
            String funcionario = scanner.nextLine();

            System.out.println("Digite o salario do funcionario: ");
            double salario = scanner.nextDouble();

            novoSalario = salario + (salario * 0.10);

            System.out.println("Funcionario: " + funcionario);
            System.out.println("Novo salario: " + novoSalario);

            scanner.nextLine();

        }
        scanner.close();
    }
}