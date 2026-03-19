package exerciciosFOR;

import java.util.Scanner;

//O programa pede nome e 3 notas de 5 alunos, calcula a média de cada um e imprime
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double media = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite o nome do aluno: ");
            String aluno = scanner.nextLine();

            System.out.println("Digite a primeira nota do aluno: ");
            double nota1 = scanner.nextDouble();

            System.out.println("Digite a segunda nota do aluno: ");
            double nota2 = scanner.nextDouble();

            System.out.println("Digite a terceira nota do aluno: ");
            double nota3 = scanner.nextDouble();

            media = (nota1 + nota2 + nota3) / 3;

            System.out.println("Aluno: " + aluno);
            System.out.println("Média: " + media);

            scanner.nextLine();

        }
        scanner.close();
    }
}