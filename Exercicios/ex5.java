package exercicios;
/*5. Cadastro de CPF (Validação Simples) -  Peça ao usuário digitar o CPF.
•	Não pode estar vazio.
•	Deve ter 11 caracteres.
•	Se diferente disso, mostrar erro.
(Sem validar cálculo do CPF, apenas tamanho)
 */
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diite seu CPF: ");
        String cpf = scanner.nextLine();

        if(cpf.isEmpty()){
            System.out.println("Erro! Escreva alguma coisa");
        }else{
            int newCpf = cpf.length();

            if(newCpf < 11){
                System.out.println("Cpf Inválido, deve possuir 11 letras");
            }else{
                System.out.println("Cpf cadastrado com sucesso: " + cpf);
            }
        }
    }
}
