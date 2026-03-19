// Crie um programa em JAVA que mostre na tela as opções de vendas em um Posto de combustível. Mostre um menu com:
// G  Gasolina (R$6,50 /L)
// E  Etanol (R$4,00/L)
// D  Diesel (R$6.00/L)
// Após o usuário escolhe o código e a quantidade. Calcular o total e mostrar. 
// O sistema deve voltar ao MENU para nova escolha se desejar. Ao encerrar programa exibir os totais (total litros cada tipo e total faturamento)


package ExerciciosRepeticao;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gasolina = 0;
        double etanol = 0;
        double diesel = 0;
        double faturamento = 0;
        for(;;){
            System.out.println("Menu de opções");
            System.out.println("1 - Gasolina (R$6,50)");
            System.out.println("2 - Etanol (R$4,00)");
            System.out.println("3 - Diesel (R$6,00)");
            System.out.println("4 - Sair");
            System.out.println("Escolha seu abasteciento: ");
            int opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Digite quantos litros: ");
                    double gasosa = scanner.nextDouble();
                    double valorGasolina = 6.5;
                    System.out.println("Valor total: " +(gasosa * valorGasolina));
                    gasolina += gasosa;
                    faturamento += gasosa * valorGasolina;
                    break;
                case 2:
                    System.out.println("Digite quantos litros: ");
                    double et = scanner.nextDouble();
                    double valorEt = 4.0;
                    System.out.println("Valor total: " +(et * valorEt));
                    etanol += et;
                    faturamento += et * valorEt;
                    break;
                case 3:
                    System.out.println("Digite quantos litros: ");
                    double dise = scanner.nextDouble();
                    double valorDise = 6.0;
                    System.out.println("Valor total: " +(dise * valorDise));
                    diesel += dise;
                    faturamento += dise * valorDise;
                    break;
                default:
                    System.out.println("Saindo do sistema");
                    System.out.println("Total de Gasolina: " + gasolina);
                    System.out.println("Total de Etanol: " + etanol);
                    System.out.println("Total de Diesel: " + diesel);
                    System.out.println("Total de faturamento: " + faturamento);
                    System.out.println("Sistema encerrado");
                    break;
            }

        }
    }
}
