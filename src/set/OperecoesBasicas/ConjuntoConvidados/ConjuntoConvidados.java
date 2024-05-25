package set.OperecoesBasicas.ConjuntoConvidados;

import com.sun.jdi.request.DuplicateRequestException;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> list  = new HashSet<>();

    public void adicionarConvidado(String nome, int codigoConvite)throws DuplicatedConvidadoException{
        Convidado novoConvidado = new Convidado(nome, codigoConvite);
        if (!this.list.contains(novoConvidado)) {
            this.list.add(novoConvidado);
        }else{
            throw new DuplicatedConvidadoException("Convidado já existe.");
        }
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite)throws ConvidadoNaoEncontradoException{
        boolean removed = this.list.removeIf(item -> item.getCodigoConvite() == codigoConvite);

        if (!removed) {
            throw new ConvidadoNaoEncontradoException("Convidado com código de convite " + codigoConvite + " não encontrado.");
        }
    }

    public int contarConvidados(){
        return this.list.size();
    }

    public void exibirConvidados(){
        for(Convidado convidado : this.list){
            System.out.println("Nome: " + convidado.getNome() + ", codigo: " + convidado.getCodigoConvite() + ".");
        }
    }

}

