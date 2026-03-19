package exerciciosFOR;
//O programa pede nome do cliente e 5 produtos com quantidade e preço e mostra o total da compra para o cliente

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCompras = 0;

        System.out.println("Digite nome do cliente: ");
        String nome = scanner.nextLine();

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite nome do produto: ");
            String produto = scanner.nextLine();

            System.out.println("Digite o preço do produto: ");
            double preco = scanner.nextDouble();

            System.out.println("Digite quantidade de produtos: ");
            int quantidade = scanner.nextInt();

            totalCompras = totalCompras + (preco * quantidade);
            scanner.nextLine();

        }
        System.out.println(nome + " Total da Compra: " + totalCompras);
        scanner.close();
    }
}
