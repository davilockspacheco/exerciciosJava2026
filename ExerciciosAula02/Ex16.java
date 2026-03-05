/*
Menu de Mensagens Personalizadas:Exiba um menu: 
1 – Bom dia, 2 – Boa tarde, 3 – Boa noite. Mostre a mensagem escolhida.
*/

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu de opções ");
        System.out.println("1 - Bom dia ");
        System.out.println("2 - Boa tarde ");
        System.out.println("3 - Boa noite ");
        System.out.println("4 - Sair ");
        System.out.println("Escolha sua menssagem: ");


        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("Bom dia");
                break;
            case 2:
                System.out.println("Boa tarde");
                break;
            case 3:
                System.out.println("Boa noite");
                break;
            case 4:
                System.out.println("Saindo do sistema");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
