package exercicios;
/*8. Cadastro de Usuário e Senha - Peça ao usuário digitar um nome e uma senha
•	Nenhum pode estar vazio
•	Senha deve ter no mínimo 6 caracteres
Mostrar mensagem de sucesso ou erro.
 */
import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();
        int newSenha = senha.length();

        if(nome.isEmpty() || senha.isEmpty() || newSenha <=5){
            System.out.println("Erro! Não deixe os campos vazio ou digite 6 caracteres ou mais");
        }else{
            System.out.println("Sucesso");
        }
    }
}
