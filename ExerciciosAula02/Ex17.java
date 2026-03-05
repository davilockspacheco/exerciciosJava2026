import java.util.Scanner;
public class Ex17 {
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
