// 8) Crie um programa em JAVA que mostre na tela as opções de uma EMPRESA. Mostre um menu com:
// Menu de Descontos da Folha Pagamento:
// 1 - Vale transporte (6%)
// 2 - Vale alimentação (10%)
// 3 - Plano de saúde (12%)
// 4 - Todos geral dos descontos
// Após o usuário escolhe o código da operação. Informar nome funcionário, o salario inicial e após calcular o desconto e mostrar também o salario final. 
// O sistema deve voltar ao MENU para nova escolha se desejar.
// Ao encerrar programa exibir o total da folha de pagamento.

package ExerciciosRepeticao;

import java.util.Scanner;

public class ex8 {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;

        for (;;) {
            System.out.println("\n----- MENU -----            ");
            System.out.println("1 - Vale transporte (6%)      ");
            System.out.println("2 - Vale alimentação (10%)    ");
            System.out.println("3 - Plano de saúde (12%)      ");
            System.out.println("4 - Todos geral dos descontos ");
            System.out.println("0 - Encerrar                  ");
            System.out.println("\n Escolha:                   ");

            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o nome do funcionario: ");
                scanner.nextLine();
                String nomeFuncionario = scanner.nextLine();

                System.out.println("Digite o salario inicial do funcionario: ");
                double salario_funcionario = scanner.nextDouble();

                System.out.println("O novo Salario do Funcionario: " + nomeFuncionario + " é " + (salario_funcionario -(salario_funcionario * 0.06) ));
                total += ((salario_funcionario * 0.06) + salario_funcionario);

            } 
            else if (opcao == 2) {
                System.out.println("Digite o nome do funcionario: ");
                scanner.nextLine();
                String nomeFuncionario = scanner.nextLine();

                System.out.println("Digite o salario inicial do funcionario: ");
                double salario_funcionario = scanner.nextDouble();

                System.out.println("O novo Salario do Funcionario: " + nomeFuncionario + " é " + (salario_funcionario - (salario_funcionario * 0.10) ));
                total += ((salario_funcionario * 0.10) + salario_funcionario);

            } 
            else if (opcao == 3) {
                System.out.println("Digite o nome do funcionario: ");
                scanner.nextLine();
                String nomeFuncionario = scanner.nextLine();

                System.out.println("Digite o salario inicial do funcionario: ");
                double salario_funcionario = scanner.nextDouble();

                System.out.println("O novo Salario do Funcionario: " + nomeFuncionario + " é " + (salario_funcionario - (salario_funcionario * 0.12)));
                total += ((salario_funcionario * 0.12) + salario_funcionario);
            } 
            else if (opcao == 4) {
                System.out.println("Digite o nome do funcionario: ");
                scanner.nextLine();
                String nomeFuncionario = scanner.nextLine();

                System.out.println("Digite o salario inicial do funcionario: ");
                double salario_funcionario = scanner.nextDouble();

                System.out.println("O novo Salario do Funcionario: " + nomeFuncionario + " é " + (salario_funcionario - (salario_funcionario * 0.28)));
                total += ((salario_funcionario * 0.28) + salario_funcionario);

            } 
            else if (opcao == 0) {
                System.out.println("Encerrando o Sistema.......");
                System.out.println("Total Folha Pagamento: " + total);
                scanner.close();
                break;

            } 
            else {
                System.out.println("Erro tente novamente");
            }
        }
    }

}
