/*
Classificação de Idade (if-else if): Leia a idade de uma pessoa e classifique-a em: 
Criança (0-12), Adolescente (13-17), Adulto (18-59) ou Idoso (60+).
*/

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite uma idade: ");
        int idade = scanner.nextInt();

        if(idade > 0 && idade <= 12){
            System.out.println("Criança");
        }
        else if (idade > 18 && idade <= 59){
            System.out.println("Adulto");
        }
        else{
            System.out.println("Idoso");
        }
    }
}
