/*14 - Cadastro de Veículo -  Peça ao usuário digitar modelo do veículo, marca e preço.
•	Validação: modelo e marca não vazio, preço maior que 0.
•	Exiba os dados.
 */

import java.util.Scanner;
public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o modelo do veículo: ");
        String veiculo = scanner.nextLine();
        System.out.println("Digite a marca: ");
        String marca = scanner.nextLine();
        System.out.println("Digite o preço: ");
        double preco = scanner.nextDouble();

        if(veiculo.isEmpty() || marca.isEmpty()){
            System.out.println("Erro! Não deixe os campos vazios");
        }
        else if(preco <= 0 ){
            System.out.println("Não deixe o preço menor ou igual a 0");
        }else{
            System.out.println("Cadastro realizado com sucesso");
            System.out.println("Veículo: " + veiculo);
            System.out.println("Marca: " + marca);
            System.out.println("Preço: " + preco);
        }
    }
}
