import java.util.Scanner;

public class Cadastrar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu telefone: ");
        String telefone = scanner.nextLine();

        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);

        scanner.close();
    }
}
