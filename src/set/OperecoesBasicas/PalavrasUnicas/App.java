package set.OperecoesBasicas.PalavrasUnicas;

public class App {

    public static void main(String[] args) throws PalavraRepetidaException, PalavraNaoEncontradaException {
        ConjuntoPalavrasUnicas cpu = new ConjuntoPalavrasUnicas();

        cpu.adicionarPalavra("JAMBROBA");
        cpu.adicionarPalavra("PICIBIROBA");
        cpu.adicionarPalavra("JAMELÃO");
        cpu.removerPalavra("JAMELÃO");
        cpu.exibirPalavrasUnicas();

    }

}
