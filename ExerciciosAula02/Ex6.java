/*. Verificação de Triângulo (if Composto): 
Receba três valores de lados e verifique se eles podem formar um triângulo 
(cada lado deve ser menor que a soma dos outros dois).
 */

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double num = scanner.nextDouble();
        System.out.println("Digite outro numero: ");
        double num2 = scanner.nextDouble();
        System.out.println("Digite outro numero: ");
        double num3 = scanner.nextDouble();

        if (num < (num2 + num3) && (num2 < (num + num3)) && (num3 < (num2 + num))) {
            System.out.println("Pode ser um triangulo");
        } else {
            System.out.println("Não pode ser um trinalgulo");
        }
    }
}
