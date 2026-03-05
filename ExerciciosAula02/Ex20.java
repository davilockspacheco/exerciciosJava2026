import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Salario do Funcionario: ");
        Double salario = scanner.nextDouble();

        System.out.println("Digite a opção desejada:           ");
        System.out.println("1 - 10% de bonus                   ");
        System.out.println("2 - 15% de bonus                   ");
        System.out.println("3 - 20% de bonus                   ");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("O novo salario é de: " + (salario + (salario * 0.10)) + " Reais");
                break;
            case 2:
                System.out.println("O novo salario é de: " + (salario + (salario * 0.15)) + " Reais");
                break;
            case 3:
                System.out.println("O novo salario é de: " + (salario + (salario * 0.20)) + " Reais");
                break;

            default:
                System.out.println("Erro: tente novamente");
                break;
        }
        scanner.close();
    }

}
