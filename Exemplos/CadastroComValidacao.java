import java.util.Scanner;
public class CadastroComValidacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu telefone: ");
        String telefone = scanner.nextLine();

        if(nome.isEmpty() || telefone.isEmpty()){
            System.out.println("Preencha um dos campos vazios");
        }else{
            System.out.println("Cadastro concluído ");
            System.out.println("Nome: " + nome);
            System.out.println("Telefone: " + telefone);
        }
    }
}
