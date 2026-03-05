/*Menu de Opções (switch-case): Exiba um menu com 3 opções 
(1-Cadastrar, 2-Listar, 3-Sair) e use switch para imprimir a ação escolhida.
 */

import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu de opções");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar");
        System.out.println("3 - Sair");
        System.out.println("Escolha uma opção: ");

        int escolha = scanner.nextInt();
        if(escolha == 1){
            System.out.println("Vocês escolheu a opção cadastrar");
        }
        else if(escolha == 2){
            System.out.println("Vocês escolheu a opção listar");
        }else{
            System.out.println("Sistema encerrado");
        }
    }
}
