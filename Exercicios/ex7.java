package exercicios;
/*7. Cadastro de Telefone com Tamanho Mínimo - Peça ao usuário digitar o telefone.
•	Não pode estar vazio.
•	Deve ter no mínimo 8 dígitos.
•	Mostrar erro se inválido.
 */
import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite numero de telefone:");

        String telefone = scanner.nextLine();
        int newTelefone = telefone.length();

        if(telefone.isEmpty()){
            System.out.println("Erro! Não deixe em branco");
        } 
        else if(newTelefone <= 0 || newTelefone >= 9){
            System.out.println("Erro! Não deixe o campo vazio ou ultrapasse 8 caracteres");
        }else{
            System.out.println("Telefone cadastrado com sucesso: " + telefone);
        }
    }
}

