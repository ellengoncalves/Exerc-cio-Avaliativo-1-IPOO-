package ProjetoUsMoney;

public class UsMoney {
  // declaram duas variáveis privadas para armazenar os valores dos dólares e centavos da instância UsMoney
  private int dollars;
  private int cents;

  // verifica se os centavos fornecidos estão fora do intervalo válido (menor que 0 ou maior ou igual a 100). Se caso estiverem fora desse intervalo, o codigo calcula a quantidade de dolares extras nos centavos, adiciona esses dolares extras a parte dos dolares e mantem apenas os centavos apos a conversão.
  // atribui os valores corrigidos as variaveis de instancia dollars e cents
  public UsMoney(int dollars, int cents) {
    if (cents < 0 || cents >= 100) {
      int extraDollars = cents / 100;
      dollars += extraDollars;
      cents %= 100;
    }

    this.dollars = dollars;
    this.cents = cents;
  }

  // recebe outra instancia UsMoney como argumento e realiza a adicao dos dolares e centavos das duas instancias
  // novamente, verifica se os centavos somados estão fora do intervalo válido e ajusta os dolares e centavos conforme necessario
  // retorna uma nova instância UsMoney com os valores somados
  public UsMoney plus(UsMoney other) {
    int newDollars = this.dollars + other.dollars;
    int newCents = this.cents + other.cents;

    if (newCents >= 100) {
      newDollars += newCents / 100;
      newCents %= 100;
    }

    return new UsMoney(newDollars, newCents);
  }

  // retorna uma representação em string do valor monetário no formato "Valor: x dollars e y cents", onde x é a parte dos dólares e y é a parte dos centavos.
  public String RetornaValor() {
    return "Valor: " + dollars + " dollars e " + cents + " cents";
  }
}
