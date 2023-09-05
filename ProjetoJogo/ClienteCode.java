package ProjetoJogo; //  define o pacote ao qual a classe ClienteCode pertence

public class ClienteCode {

    // método principal que é executado quando o programa é iniciado
    public static void main(String[] args) {
        // cria duas instâncias da classe Dados para representar dois dados.
        Dados dado1 = new Dados();
        Dados dado2 = new Dados();

        // simula três rodadas de lançamento de dados
        for (int i = 0; i < 3; i++) {

            // chama o metodo jogarDados de cada dado para obter os resultados aleatorios entre 1 e 6 das jogadas
            int jogada1 = dado1.jogarDados();
            int jogada2 = dado2.jogarDados();

            int resultado = jogada1 + jogada2;

            System.out.printf("Dado 1: %d    Dado 2: %d\n", jogada1, jogada2);
            System.out.printf("Resultado: %d\n\n", resultado);
        }
    }
}