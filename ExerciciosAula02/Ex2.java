/*Aprovação Escolar (if-else if): Leia uma nota de 0 a 10. 
Se for maior ou igual a 7, imprima "Aprovado"; entre 5 e 6.9, "Recuperação"; menor que 5, "Reprovado".
 */

import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        double nota = scanner.nextDouble();

        if(nota >= 7){
            System.out.println("Aprovado");
        }
        else if (nota >= 5 && nota <= 6.9) {
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
