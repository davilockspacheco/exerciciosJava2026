/*1. Cadastro de Email com Validação - Peça ao usuário para digitar um email.
•	Verifique se não está vazio.
•	Verifique se contém "@".
•	Se estiver inválido, mostrar mensagem de erro.
 */
package exercicios;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();

        if(email.isEmpty() || !email.contains("@")){
            System.out.println("Erro! Digite seu email completo com o @");
        }
        else{
            System.out.println("Email cadastrado: " + email);
        }
    }
}
