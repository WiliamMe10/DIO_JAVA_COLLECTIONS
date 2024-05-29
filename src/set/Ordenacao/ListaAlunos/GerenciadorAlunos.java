package set.Ordenacao.ListaAlunos;

import javax.swing.text.html.Option;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> list = new HashSet<>();

    public void adicionarAluno(String nome, int matricula, double nota) throws NotaInvalidaException {
        Aluno novoAluno = new Aluno(nome, matricula, nota);

        this.list.add(novoAluno);
    }

    public void removerAluno(int matricula) throws AlunoNaoExisteException {
        Optional<Aluno> aluno = this.list.stream().filter(item -> item.getMatricula() == matricula).findFirst();

        if(aluno.isEmpty()){
            throw new AlunoNaoExisteException(matricula);
        }

        this.list.remove(aluno.get());
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(this.list);

        for(Aluno aluno : alunosPorNome){
            System.out.println("Matricula: " + aluno.getMatricula() + ", Nome: " + aluno.getNome() + ", Nota: " + aluno.getNota());
        }
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new CompararPorNota());
        alunosPorNota.addAll(this.list);
        for(Aluno aluno : alunosPorNota){
            System.out.println("Matricula: " + aluno.getMatricula() + ", Nome: " + aluno.getNome() + ", Nota: " + aluno.getNota());
        }
    }

    public void exibirAlunos(){
        for(Aluno aluno : this.list){
            System.out.println("Matricula: " + aluno.getMatricula() + ", Nome: " + aluno.getNome() + ", Nota: " + aluno.getNota());
        }
    }

}
