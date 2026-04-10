import java.util.Scanner;

import triagulo.trianglePOO;

public class triangulo {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Trazendo informações da outra classe
    trianglePOO x, y;
    x = new trianglePOO();
    y = new trianglePOO();

    // pedidndo valores do triângulo X
    System.out.println("Insira os valores do triângulo X (a, b, c): ");
    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();

    // pedidndo valores do triângulo Y
    System.out.println("Insira os valores do triângulo Y (a, b, c): ");
    y.a = sc.nextDouble();
    y.b = sc.nextDouble();
    y.c = sc.nextDouble();

    /*
     * System.out.println("Insira os valores do triângulo X (a, b, c): ");
     * xA = sc.nextDouble();
     * xB = sc.nextDouble();
     * xC = sc.nextDouble();
     * 
     * System.out.println("Insira os valores do triângulo Y (a, b, c): ");
     * yA = sc.nextDouble();
     * yB = sc.nextDouble();
     * yC = sc.nextDouble();
     */

    /*
     * //triangulo X
     * double p = (x.a+x.b+x.c)/2.0;
     * double areaX = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
     * 
     * //trianulo Y
     * p = (y.a+y.b+y.c)/2.0;
     * double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
     */
    double areaX = x.area();
    double areaY = y.area();

    System.out.printf("\n Área do triângulo X: %.4f%n ", areaX);
    System.out.printf("\n Área do triângulo Y: %.4f%n ", areaY);

    if (areaX > areaY) {
      System.out.println("\n Área Maior: X");
    } else {
      System.out.println("\n Área Maior: Y");
    }

  }
}
