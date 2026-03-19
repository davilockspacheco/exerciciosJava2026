package exercicios;
/*10. Cadastro de Produto – Peça ao usuário digitar o Nome do produto e Preço
•	Nome não pode estar vazio
•	Preço deve ser maior que zero
Se válido, mostrar dados cadastrados.
 */

import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String produto =  scanner.nextLine();
        System.out.println("Digite o preço: ");
        double preco = scanner.nextDouble();

        if(produto.isEmpty()){
            System.out.println("Erro! Não deixe o nome do produto vazio");
        }
        else if(preco < 0){
            System.out.println("Erro! Preço deve ser maior que 0");
        }else{
            System.out.println("Produto " + produto);
            System.out.println("Preço: " + preco);
        }
    }
}
