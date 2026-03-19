package exerciciosFOR;
//O usuário digita nome aluno, disciplina e pergunta quantas notas. Calcular a media e mostrar no final

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a disciplina do aluno: ");
        String disciplina = scanner.nextLine();

        System.out.println("Digite quantas notas deseja calcular: ");
        int quantidade = scanner.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Digite a nota " + i + ":");
            double nota = scanner.nextDouble();

            soma = soma + nota;
        }

        double media = soma / quantidade;
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Média final: " + media);

        scanner.close();

    }
}
