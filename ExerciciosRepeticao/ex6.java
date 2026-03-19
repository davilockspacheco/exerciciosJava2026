// Crie um programa em JAVA que mostre na tela as opções de uma EMPRESA. Mostre um menu com:
// Menu de Cargos:
// G  Gerente (bônus 20%)
// S  Supervisor (bônus 15%)
// F  Funcionário (bônus 10%)
// E  Estagiário (bônus 5%)
// Após o usuário escolhe o código do cargo. Informar nome funcionário, o salario inicial e após calcular o novo salário já com bônus. 
// O sistema deve voltar ao MENU para nova escolha se desejar. Ao encerrar programa exibir o total da folha de pagamento.


package ExerciciosRepeticao;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        for(;;){
            System.out.println("Menu de opções");
            System.out.println("1 - Gerente (bônus 20%)");
            System.out.println("2 - Supervisor (bônus 15%)");
            System.out.println("3 - Funcionário (bônus 10%)");
            System.out.println("4 - Estagiário (bônus 5%)");
            System.out.println("5 - Sair");
            System.out.println("Escolha seu cargo: ");
            int opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Digite seu nome: ");
                    scanner.nextLine();
                    String nomeGerente = scanner.nextLine();
                    System.out.println("Digite seu salario: ");
                    double salarioGerente = scanner.nextDouble();
                    System.out.println("Salario do(a) " + nomeGerente + " é " + ((salarioGerente * 0.20) + salarioGerente));
                    total += (salarioGerente * 0.20) + salarioGerente;
                    break;
                case 2:
                    System.out.println("Digite seu nome: ");
                    scanner.nextLine();
                    String nomeSupervisor = scanner.nextLine();
                    System.out.println("Digite seu salario: ");
                    double salarioSupervisor = scanner.nextDouble();
                    System.out.println("Salario do(a) " + nomeSupervisor + " é " + ((salarioSupervisor * 0.15) + salarioSupervisor));
                    total += (salarioSupervisor * 0.15) + salarioSupervisor;
                    break;
                case 3:
                    System.out.println("Digite seu nome: ");
                    scanner.nextLine();
                    String nomeFuncionario = scanner.nextLine();
                    System.out.println("Digite seu salario: ");
                    double salarioFuncionario = scanner.nextDouble();
                    System.out.println("Salario do(a) " + nomeFuncionario + " é " + ((salarioFuncionario * 0.10) + salarioFuncionario));
                    total += (salarioFuncionario * 0.10) + salarioFuncionario;
                    break;
                case 4:
                    System.out.println("Digite seu nome: ");
                    scanner.nextLine();
                    String nomeEstagiario = scanner.nextLine();
                    System.out.println("Digite seu salario: ");
                    double salarioEstagiario = scanner.nextDouble();
                    System.out.println("Salario do(a) " + nomeEstagiario + " é " + ((salarioEstagiario * 0.05) + salarioEstagiario));
                    total += (salarioEstagiario * 0.05) + salarioEstagiario;
                    break;
                
                default:
                    System.out.println("Saindo do sistema");
                    System.out.println("Total de folha de pagamento: " + total);
                    break;
            }

        }
    }
}
