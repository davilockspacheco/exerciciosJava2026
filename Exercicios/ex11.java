package exercicios;
/*11 - Cadastro de Pessoa com sua Função - Peça ao usuário digitar nome e função 
(ex: “estudante”, “professor”).
•	Valide se os campos não estão vazios.
•	Mostre os dados cadastrados.
 */

import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua função: ");
        String funcao = scanner.nextLine();

        if(nome.isEmpty() || funcao.isEmpty()){
            System.out.println("Erro! Não deixe nenhum campo vazio");
        }else{
            System.out.println("Nome: " + nome);
            System.out.println("Função: " + funcao);
        }
    }
}
