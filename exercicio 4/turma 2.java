import java.util.Scanner;

public class TesteTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da turma:");
        String nome = scanner.nextLine();

        System.out.println("Digite o nome do curso:");
        String curso = scanner.nextLine();

        System.out.println("Digite a quantidade de alunos:");
        int quantidadeDeAlunos = scanner.nextInt();

        System.out.println("Digite a série da turma:");
        int serie = scanner.nextInt();

        Turma turma = new Turma(nome, curso, quantidadeDeAlunos, serie);

        System.out.println("\nInformações da turma criada:");
        turma.exibirInformacoes();

        System.out.println("\nDigite a nova quantidade de alunos:");
        int novaQuantidadeDeAlunos = scanner.nextInt();

        turma.setQuantidadeDeAlunos(novaQuantidadeDeAlunos);

        System.out.println("\nInformações da turma após a modificação:");
        turma.exibirInformacoes();

        scanner.close();
    }
}
