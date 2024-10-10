import java.util.Scanner;

public class TesteProduto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();

        System.out.println("Digite o preço do produto:");
        double preco = scanner.nextDouble();

        System.out.println("Digite a quantidade do produto:");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        System.out.println("\nProduto criado:");
        produto.exibirInformacoes();

        scanner.close();
    }
}
