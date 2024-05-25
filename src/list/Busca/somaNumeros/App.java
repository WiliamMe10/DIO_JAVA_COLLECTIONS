package list.Busca.somaNumeros;

public class App {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(25);

        // Somando os números
        int soma = somaNumeros.somarNumeros();
        System.out.println("Soma dos números: " + soma);

        // Encontrando o maior número
        int maior = somaNumeros.encontrarMaiorNumero();
        System.out.println("Maior número: " + maior);

        // Encontrando o menor número
        int menor = somaNumeros.encontrarMenorNumero();
        System.out.println("Menor número: " + menor);
    }
}
