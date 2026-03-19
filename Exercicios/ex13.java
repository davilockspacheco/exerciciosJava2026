package exercicios;
/*13 - Cadastro de Produto mercado - Peça ao usuário digitar nome do alimento e quantidade.
•	Validação: nome não vazio, quantidade maior que 0.
•	Exiba os dados.
 */

import java.util.Scanner;
public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do alimento: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        if(nome.isEmpty()){
            System.out.println("Erro! Não deixe o campo em branco");
        }
        else if(quantidade <= 0){
            System.out.println("Erro! De um valor ao produto");
        }else{
            System.out.println("Produto cadastrado com sucesso!");
            System.out.println("Produto: " + nome);
            System.out.println("Quantidade: " + quantidade);
        }
    }
}
