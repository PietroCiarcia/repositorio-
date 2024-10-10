import java.util.Scanner;

public class TesteDisciplina {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da disciplina:");
        String nome = scanner.nextLine();

        System.out.println("Digite o nome do professor:");
        String professor = scanner.nextLine();

        System.out.println("Digite o semestre da disciplina:");
        int semestre = scanner.nextInt();

        System.out.println("A disciplina é ofertada? (true/false):");
        boolean ofertada = scanner.nextBoolean();

        Disciplina disciplina = new Disciplina(nome, professor, semestre, ofertada);

        System.out.println("\nDisciplina criada:");
        disciplina.exibirInformacoes();

        scanner.close();
    }
}
