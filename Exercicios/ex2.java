/*2. Cadastro de Idade -  Peça ao usuário para digitar a idade.
•	Se estiver vazia, mostrar erro.
•	Se idade for menor que 0 ou maior que 120, mostrar "Idade inválida".
•	Caso contrário, exibir idade cadastrada.
 */

package exercicios;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        String idade = scanner.nextLine();

        if(idade.isEmpty()){
            System.out.println("Erro! Digite sua idade!");
        }else{
            int idadeNew = Integer.parseInt(idade);
            if(idadeNew < 0 || idadeNew > 120){
                System.out.println("Idade Invalida");
            }else{
                System.out.println("Idade cadastrada com sucesso: " + idadeNew);
            }
        }        
    }
}
