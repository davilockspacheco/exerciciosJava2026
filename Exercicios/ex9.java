/*9. Cadastro de Nota Escolar - Peça ao usuário digitar nome aluno e uma nota de 0 a 10.
•	Se menor que 0 ou maior que 10 → inválida
•	Se entre 0 e 10 → válida
•	Mostrar a situação.
 */
import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite uma nota de 0 a 10: ");
        double nota = scanner.nextDouble();
        if(nota < 0 || nota > 10){
            System.out.println("Erro! Digite uma nota entre 0 e 10");
        }
        
        else if(nota >= 7){
            System.out.println(nome + " está aprovado ");
        }else{
            System.out.println(nome + " está reprovado ");
        }
    }
}
