/*
Cálculo de Desconto (if-else): Leia o valor de uma compra. 
Se for acima de R$ 100,00, aplique 10% de desconto; caso contrário, não há desconto. Exiba o valor final
*/

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite valor da compra: ");
        double valor = scanner.nextDouble();
        double valorDesconto = valor * 0.10;
        
        if(valor >= 100){
            System.out.println(valor - valorDesconto);
        }else{
            System.out.println("Sem desconto");
        }
    }
}
