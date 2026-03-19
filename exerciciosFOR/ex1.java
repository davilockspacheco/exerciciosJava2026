package exerciciosFOR;
//O programa pede nome e salário de 3 funcionários e imprime o total de salários e a média salarial

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSalarios = 0;



        for (int i = 0; i < 3; i++) {
            
            System.out.println("Digite o nome do funcionario: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o salario do funcionario: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            totalSalarios = totalSalarios + salario;

        }
        double media = totalSalarios / 3;

        System.out.println("Total de salarios: " + totalSalarios);
        System.out.println("Média salarial: " + media);

        scanner.close();
    }
}
