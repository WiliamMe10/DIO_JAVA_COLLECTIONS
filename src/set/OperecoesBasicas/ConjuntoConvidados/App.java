package set.OperecoesBasicas.ConjuntoConvidados;

public class App {
    public static void main(String[] args) throws DuplicatedConvidadoException {

        ConjuntoConvidados cv = new ConjuntoConvidados();

        cv.adicionarConvidado("Wiliam", 114);
        cv.adicionarConvidado("Wiliam", 114);
        cv.adicionarConvidado("Pedro", 457);
        cv.adicionarConvidado("João", 782);
        cv.adicionarConvidado("Camilo", 148);
        System.out.println("Número atual de convidados: " + cv.contarConvidados());
        System.out.println("----------------- CONVIDADOS -----------------");
        cv.exibirConvidados();
    }

}
