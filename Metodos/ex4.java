// 4. Conversor de temperatura
// Crie um programa JAVA que contenha  funções para converter temperaturas:
// Celsius, Fahrenheit  e Kelvin   O usuário entra com a temperatura e escolhe a conversão.


package Metodos;

import java.util.Scanner;

public class ex4 {
    public static double fahrenheit(double temperaturaC){
        return (temperaturaC * 9/5) + 32;
    }
    public static double kelvin(double temperaturaC){
        return temperaturaC + 273.15;
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Digite um valor em Celcios: ");
        double temperatura = scanner.nextDouble();
        System.out.println("Menu de opções");
        System.out.println("1  fahrenheit ");
        System.out.println("2  kelvin ");
        int opc = scanner.nextInt();
        double resultado;

        switch (opc) {
            case 1:
                resultado = fahrenheit(temperatura);
                System.out.println("Seu valor convertido é: " + fahrenheit(temperatura));
                break;
            case 2: 
            resultado = kelvin(temperatura);
            System.out.println("Seu valor convertido é: " + kelvin(temperatura));
        
            default:
                scanner.close();
                break;
        }
    }
}
