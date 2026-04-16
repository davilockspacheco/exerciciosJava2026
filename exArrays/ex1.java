import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = {5, 5, 7, 12, 6, 19, 2, 3};
        int soma = 0;

        for(int n : numeros){
            soma += n;
        }
        System.out.println("A soma dos elementos é: " + soma);
    }
}
