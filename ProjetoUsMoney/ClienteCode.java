package ProjetoUsMoney;

public class ClienteCode {
    public static void main(String[] args) {
        // Caso 1 - soma dos dolares sem centavos
        UsMoney money1Case1 = new UsMoney(20, 0);
        UsMoney money2Case1 = new UsMoney(5, 0);
        UsMoney resultadoCase1 = money1Case1.plus(money2Case1);

        // Caso 2 - soma dos dolares com centavos
        UsMoney money1Case2 = new UsMoney(15, 75);
        UsMoney money2Case2 = new UsMoney(3, 50);
        UsMoney resultadoCase2 = money1Case2.plus(money2Case2);

        // Caso 3 - soma dos dolares e centavos
        UsMoney money1Case3 = new UsMoney(50, 50);
        UsMoney money2Case3 = new UsMoney(25, 25);
        UsMoney resultadoCase3 = money1Case3.plus(money2Case3);

        // Caso 4 - dolar com valor negativo
        UsMoney money1Case4 = new UsMoney(-10, 25);
        UsMoney money2Case4 = new UsMoney(3, 50);
        UsMoney resultadoCase4 = money1Case4.plus(money2Case4);

        // Caso 5 - centavo com valor negativo
        UsMoney money1Case5 = new UsMoney(76, 21);
        UsMoney money2Case5 = new UsMoney(87, -13);
        UsMoney resultadoCase5 = money1Case5.plus(money2Case5);

        // Caso 7 - soma dos dolares e centavos acima de 99
        UsMoney money1Case7 = new UsMoney(5, 99);
        UsMoney money2Case7 = new UsMoney(2, 150);
        UsMoney resultadoCase7 = money1Case7.plus(money2Case7);

        // Caso 8 - soma de valores sem dolares
        UsMoney money1Case8 = new UsMoney(0, 50);
        UsMoney money2Case8 = new UsMoney(0, 75);
        UsMoney resultadoCase8 = money1Case8.plus(money2Case8);

        System.out.println("Caso 1: " + resultadoCase1.RetornaValor());
        System.out.println("Caso 2: " + resultadoCase2.RetornaValor());
        System.out.println("Caso 3: " + resultadoCase3.RetornaValor());
        System.out.println("Caso 4: " + resultadoCase4.RetornaValor());
        System.out.println("Caso 5: " + resultadoCase5.RetornaValor());
        System.out.println("Caso 7: " + resultadoCase7.RetornaValor());
        System.out.println("Caso 8: " + resultadoCase8.RetornaValor());
    }
}
