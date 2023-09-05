package ProjetoTriangulo;

import java.util.Scanner;

public class ClienteCode {

    public static void main(String[] args) {
        // declaracao de variaveis e referencias
        Scanner scanner;

        // instanciar objetos
        scanner = new Scanner(System.in);

        for (int controle = 0; controle != 5; controle += 1) {
            System.out.println("Digite os tres lados: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            // instanciar um triangulo, chamando a classe triangulo
            // mas so consede acesso se tiver publico
            Triangulo dadosTriangulo = new Triangulo(a, b, c);

            // pra acessar a funcao tem que ser pela classe, por isso variavel + . + funcao
            if (dadosTriangulo.ehEquilatero()) {
                System.out.println("Triangulo Equilatero!");
            } else {
                if (dadosTriangulo.ehEscaleno()) {
                    System.out.println("Triangulo Escaleno!");
                } else {
                    if (dadosTriangulo.ehIsoceles()) {
                        System.out.println("Triangulo Isoceles!");
                    } else {
                        System.out.println("Dados nao formam triangulo!");
                    }
                }
            }
        }

        scanner.close(); // voce deve chamar o metodo close() para liberar imediatamente qualquer recurso
                         // que tenha sido alocado, evitando excecoes de esgotamento de recursos e outros
                         // problemas.
    }
}
