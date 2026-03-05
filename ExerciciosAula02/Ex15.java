/*
Menu de Formas Geométricas:Permita escolher entre: 
1 – Quadrado, 2 – Retângulo, 3 – Triângulo. Peça as medidas e calcule a área correspondente.
*/

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu de opções");
        System.out.println("Calcule a área correspondente: ");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retangulo");
        System.out.println("3 - Triangulo");
        System.out.println("4 - Sair");

        int op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.println("Valor do lado 1: ");
                double lado1quadrado = scanner.nextDouble();
                System.out.println("Valor do lado 2: ");
                double lado2quadrado = scanner.nextDouble();
                double calculoQuadrado = lado1quadrado * lado2quadrado;
                System.out.println("Area do quadrado = " + calculoQuadrado);
                break;
            
            case 2:
                System.out.println("Valor do lado: ");
                double lado1retangulo = scanner.nextDouble();
                System.out.println("Valor da base: ");
                double baseRetangulo = scanner.nextDouble();
                double calculoRetangulo = lado1retangulo * baseRetangulo;
                System.out.println("Area do retangulo = " + calculoRetangulo);
                break;

            case 3:
                System.out.println("Valor da altura: ");
                double alturaTriangulo = scanner.nextDouble();
                System.out.println("Valor da base: ");
                double baseTriangulo = scanner.nextDouble();
                double calculoTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                System.out.println("Area do triangulo = " + calculoTriangulo);
                break;
            case 4:
                System.out.println("Saindo do sistema");
            break;
            default:
                System.out.println("Erro");
                break;
        }
    }
}
