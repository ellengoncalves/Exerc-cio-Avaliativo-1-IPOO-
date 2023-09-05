package ProjetoTriangulo;

public class Triangulo{

    // atributos, que sao as variaveis da classe
    private int ladoA;
    private int ladoB;
    private int ladoC;
    // private para ngm ter acesso a elas, nao eh visivel pro cliente

    // passa os dados
    // metodo construtor, pra que essa classe exista no cliente
    public Triangulo(int ladoA, int ladoB, int ladoC) {
        // esse lado A (DESSA classe) recebe o que for passado em parametro
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    // metodo de classes
    // boolean retorna se eh verdadeiro ou falso
    // verifica se eh triangulo
    private boolean isTriangulo(){
        return ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA;
    }


    // se for triangulo, verifica se eh equilatero
    public boolean ehEquilatero(){
        if(isTriangulo()){
            return ladoA == ladoB && ladoA == ladoC;
        }
        return false;
    }

    // se for triangulo, verifica se eh escaleno
    public boolean ehEscaleno(){
        if(isTriangulo()){
            return ladoA != ladoB && ladoB != ladoC && ladoA != ladoC;
        }
        return false;
    }

    // se for triangulo, verifica se eh isoceles
    public boolean ehIsoceles(){
        if(isTriangulo()){
            return ladoA == ladoB || ladoB == ladoC || ladoA == ladoC;
        }
        return false;
    }
}