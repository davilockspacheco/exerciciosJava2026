/*4. Cadastro de Nome Completo -  Peça ao usuário para digitar nome completo.
•	Não pode estar vazio.
•	Deve conter pelo menos um espaço (nome e sobrenome).
•	Caso contrário, pedir para digitar nome completo.
 */
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        if(nome.isEmpty() || !nome.contains(" ")){
            System.out.println("Digite seu nome e sobrenome");
        }else{
            System.out.println("Nome cadastrado com sucesso: " + nome);
        }
    }
}
