package set.Ordenacao.ListaAlunos;

public class NotaInvalidaException extends Exception{

    NotaInvalidaException(){
        super("A nota tem que ser entre 0 e 10.");
    }

}
