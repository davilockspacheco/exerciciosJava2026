package exercicios;
/*6. Cadastro de Número Positivo - Peça ao usuário digitar um número inteiro.
•	Se for negativo, mostrar erro.
•	Se for zero, avisar que é neutro.
•	Se positivo, confirmar cadastro.

 */
import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = scanner.nextInt();

        if(num < 0){
            System.out.println("Erro, seu número é negativo");
        }
        else if( num == 0){
            System.out.println("Erro, seu número é um número neutro");
        }else{
            System.out.println("Número inteiro cadastrado com sucesso: " + num);
        }
    }
}
