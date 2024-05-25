package set.Busca.AgendaContatos;

import set.OperecoesBasicas.ConjuntoConvidados.ConvidadoNaoEncontradoException;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class AgendaContatos {

        private Set<Contato> list = new HashSet<>();

        public void adicionarContato(String nome, long numero) throws  ContatoRepetidoException{
            Contato novoContato=  new Contato(nome, numero);

            if(!this.list.contains(novoContato)){
                    this.list.add(novoContato);
            }else{
               throw new ContatoRepetidoException("Contato ja adicionaro a lista.");
            }
        }

        public Set<Contato> pesquisarPorNome(String nome){
            return this.list.stream()
                    .filter(item-> item.getNome().equals(nome))
                    .collect(Collectors.toSet());
        }

        public void atualizarNumeroContato(String nome, long novoNumero) throws ContatoNaoEncontradoException{
            Optional<Contato> contato = this.list.stream().filter(item -> item.getNome().equals(nome)).findFirst();

            if(contato.isPresent()){
                contato.get().setNumero(novoNumero);
            }else{
                throw new ContatoNaoEncontradoException("Contao nao encontrado.");
            }
        }

        public void exibirContatos(){
            for ( Contato contato : this.list ) {
                System.out.println("Nome: " + contato.getNome() + ", número: " + contato.getNumero() + ".");
            }
        }


}
