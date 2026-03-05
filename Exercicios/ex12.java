/*12 - Cadastro de Livro - Peça usuário digitar título do livro e preço.
•	Validação: título não pode estar vazio, preço maior que 0.
•	Exiba os dados
 */

import java.util.Scanner;
public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do livro: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o preço do livro");
        double preco = scanner.nextDouble();
        
        if(nome.isEmpty()){
            System.out.println("Erro! Não deixe o campo vazio");
        }
        else if(preco <= 0) {
            System.out.println("Erro! De um valor ao livro");
        }else{
            System.out.println("Livro: " + nome);
            System.out.println("Preço: " + preco);
        }

    }
}
