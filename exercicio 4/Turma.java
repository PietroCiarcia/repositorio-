public class Turma {

    private String nome;
    private String curso;
    private int quantidadeDeAlunos;
    private int serie;

    public Turma(String nome, String curso, int quantidadeDeAlunos, int serie) {
        this.nome = nome;
        this.curso = curso;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public int getSerie() {
        return serie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
        if (quantidadeDeAlunos >= 0) {
            this.quantidadeDeAlunos = quantidadeDeAlunos;
        } else {
            System.out.println("Quantidade de alunos não pode ser negativa.");
        }
    }

    public void setSerie(int serie) {
        if (serie > 0) {
            this.serie = serie;
        } else {
            System.out.println("Série deve ser um valor positivo.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Turma: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Quantidade de Alunos: " + quantidadeDeAlunos);
        System.out.println("Série: " + serie);
    }

    public static void main(String[] args) {
        Turma turma1 = new Turma("Turma A", "Matemática", 30, 1);

        turma1.exibirInformacoes();

        turma1.setQuantidadeDeAlunos(35);

        System.out.println("\nApós modificação:");
        turma1.exibirInformacoes();
    }
}
