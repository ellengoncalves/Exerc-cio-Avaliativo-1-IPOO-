package ProjetoJogo;

import java.util.Random;

public class Dados {
    
  // método que simula o lançamento de um dado de 6 faces
  public int jogarDados(){
    Random jogo = new Random();

    // gera um número aleatório entre 0 e 5 e adiciona 1 para obter um valor entre 1 e 6
    int valor = jogo.nextInt(6) + 1;

    // retorna o valor aleatorio gerado
    return valor;
  }

}
