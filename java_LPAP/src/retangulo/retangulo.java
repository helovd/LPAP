package retangulo;

import java.util.Scanner;

public class retangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Trazendo informações de oura class
        retanguloPOO r;
        r = new retanguloPOO();

        System.out.println("Infome o valor da altura: ");
        r.height = sc.nextDouble();

        System.out.println("Informe o valor da largura: ");
        r.width = sc.nextDouble();

        double area = r.area();
        double perimetro = r.perimeter();
        double diagonal = r.diagonal();

        System.out.printf("\n Área do retângulo: %.4f%n ", area);
        System.out.printf("\n Perimetro do retângulo X: %.4f%n ", perimetro);
        System.out.printf("\n Diagonal do retângulo X: %.4f%n ", diagonal);
    }
}
