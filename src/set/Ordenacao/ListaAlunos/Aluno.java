package set.Ordenacao.ListaAlunos;

import set.Ordenacao.CadastroProdutos.Produto;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {

    private String nome;

    private int matricula;

    private double nota;

    public Aluno(String nome, int matricula, double nota) throws NotaInvalidaException {
        if(nota > 10 || nota < 0){
            throw new NotaInvalidaException();
        }
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }
}

class CompararPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
}
