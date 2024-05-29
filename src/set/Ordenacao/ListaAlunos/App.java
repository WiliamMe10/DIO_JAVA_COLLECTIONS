package set.Ordenacao.ListaAlunos;

public class App {
    public static void main(String[] args) throws NotaInvalidaException {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Wiliam", 22125, 9.8);
        gerenciadorAlunos.adicionarAluno("Pedro", 1481, 4);
        gerenciadorAlunos.adicionarAluno("João", 11871, 5.8);
        gerenciadorAlunos.adicionarAluno("maria", 856421, 8.8);

        System.out.println("Alunos: ");
        gerenciadorAlunos.exibirAlunos();

        System.out.println("Alunos por nome: ");
        gerenciadorAlunos.exibirAlunosPorNome();

        System.out.println("Alunos por nota: ");
        gerenciadorAlunos.exibirAlunosPorNota();
    }

}
