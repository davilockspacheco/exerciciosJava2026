// ) Crie um programa em JAVA que mostre na tela as opções de uma Lanchonete. Mostre um menu com:
// 1 - Hambúrguer (R$10)
// 2 - Cheeseburger (R$15)
// 3 - Batata frita (R$20)
// 4 - Refrigerante (R$5)
// Após o usuário escolhe o código do produto e a quantidade. Calcular o total e mostrar. 
// O sistema deve voltar ao MENU para nova escolha se desejar. 
// Ao encerrar o programa, mostrar o total faturamento vendido (valor R$)


package ExerciciosRepeticao;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        for(;;){
            System.out.println("Menu de opções");
            System.out.println("1 - Hambúrguer (R$10)");
            System.out.println("2 - Cheeseburger (R$15)");
            System.out.println("3 - Batata frita (R$20)");
            System.out.println("4 - Refrigerante (R$5)");
            System.out.println("5 - Sair");
            System.out.println("Escolha um lanche: ");
            int opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Digite qual a quantidade: ");
                    double hamburguer = scanner.nextDouble();
                    int valor = 10;
                    System.out.println("Valor total: " +(hamburguer * valor));
                    total += hamburguer * valor;

                    break;
                case 2:
                    System.out.println("Digite qual a quantidade: ");
                    double cheeseburger = scanner.nextDouble();
                    int valor2 = 15;
                    System.out.println("Valor total: " +(cheeseburger * valor2));
                    total += cheeseburger * valor2;
                    break;
                case 3:
                    System.out.println("Digite qual a quantidade: ");
                    double batata = scanner.nextDouble();
                    int valor3 = 20;
                    System.out.println("Valor total: " +(batata * valor3));
                    total += batata * valor3;
                    break;
                case 4:
                    System.out.println("Digite qual a quantidade: ");
                    double refri = scanner.nextDouble();
                    int valor4 = 5;
                    System.out.println("Valor total: " +(refri * valor4));
                    total += refri * valor4;
                    break;
            
                default:
                    System.out.println("Saindo do sistema");
                    System.out.println("Total de faturamento: " + total);
                    break;
            }

        }
    }
}
