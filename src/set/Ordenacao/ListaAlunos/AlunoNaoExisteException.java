package set.Ordenacao.ListaAlunos;

public class AlunoNaoExisteException extends Exception{

    AlunoNaoExisteException(int matricula){
        super("Aluno de matricula: "+  matricula +" não encontrado.");
    }

}
