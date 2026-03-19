package exerciciosFOR;
// Peça 4 notas de um aluno e calcule e mostre a média final

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        double media = 0;

        System.out.println("Digite o nome do aluno: ");
        String aluno = scanner.nextLine();

        for (int i = 0; i < 4; i++) {

            System.out.println("Digite a  nota do aluno: ");
            double nota = scanner.nextDouble();

            soma = soma + nota;

            scanner.nextLine();

        }
        media = soma / 4;
        System.out.println("Aluno: " + aluno);
        System.out.println("Média: " + media);
        scanner.close();
    }
}