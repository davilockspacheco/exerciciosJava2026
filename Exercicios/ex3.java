package exercicios;
/*3. Cadastro de Senha -  Peça ao usuário para digitar uma senha.
•	Não pode estar vazia.
•	Deve ter pelo menos 6 caracteres.
•	Mostrar mensagem de sucesso ou erro.
 */

import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma senha: ");
        String senha = scanner.nextLine();

        if(senha.isEmpty()){
            System.out.println("Senha inválida, campo vázio");
        }else{
            int newSenha = Integer.parseInt(senha);
            if(newSenha > 99999){
                System.out.println("Senha cadastrada com sucesso!");
            }else{
                System.out.println("Senha inválida, preencha o campo com 6 números");
            }
        }
    }
}
