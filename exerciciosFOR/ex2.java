package exerciciosFOR;
//O programa pede nome, quantidade e preço de 5 produtos e mostra o total de cada produto e o valor total da compra

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCompras = 0;
        int totalProdutos = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite o nome do produto: ");
            String produto = scanner.nextLine();

            System.out.println("Digite o preço do produto: ");
            double preco = scanner.nextDouble();

            System.out.println("Digite a quantidade de produtos: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine(); // limpa o enter

            totalCompras = totalCompras + (preco * quantidade);
            totalProdutos = totalProdutos + quantidade;
        }

        System.out.println("Total das Compras: " + totalCompras);
        System.out.println("Total de Produtos: " + totalProdutos);
        scanner.close();
    }
}