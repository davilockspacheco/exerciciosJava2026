// Crie um programa em JAVA que mostre na tela as opções de vendas em um Posto de combustível. Mostre um menu com:
// G  Gasolina (R$6,50 /L)
// E  Etanol (R$4,00/L)
// D  Diesel (R$6.00/L)
// Após o usuário escolhe o código e a quantidade. Calcular o total e mostrar. 
// O sistema deve voltar ao MENU para nova escolha se desejar. Ao encerrar programa exibir os totais (total litros cada tipo e total faturamento)


import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        for(;;){
            System.out.println("Menu de opções");
            System.out.println("1  Gasolina (R$6,50 /L)");
            System.out.println("2  Etanol (R$4,00/L)");
            System.out.println("3  Diesel (R$6.00/L)");
            System.out.println("Escolha uma opção: ");   
               
            int opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Qual quantidade voce deseja colocar? ");
                    double gasolina =  scanner.nextDouble();
                    double valorG = (gasolina * 6.5);
                    System.out.println("O valor deu: " + valorG);
                    total += gasolina * 6.5;

                    break;
                case 2:
                    System.out.println("Qual quantidade voce deseja colocar? ");
                    double etanol =  scanner.nextDouble();
                    double valorE = (etanol * 4);
                    System.out.println("O valor deu: " + valorE);
                    total += etanol * 4;
                    
                    break;
                case 3:
                    System.out.println("Qual quantidade voce deseja colocar? ");
                    double diesel =  scanner.nextDouble();
                    double valorD = (diesel * 6);
                    System.out.println("O valor deu: " + valorD);
                    total += diesel * 6;
                    
                    break;
            
                default:
                    System.out.println("Este é o total: " + total);
                    break;
            }
        }
    }
}
