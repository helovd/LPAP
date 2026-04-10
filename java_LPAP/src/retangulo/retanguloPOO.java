package retangulo;

import java.util.Scanner;

public class retanguloPOO {
    public double width;
    public double height;

    public double area() {
        double a;
        return a = width * height;
    };

    public double perimeter() {
        double p;
        return p = 2 * (width * height);
    };

    public double diagonal() {
        double d;
        return d = Math.sqrt(
                (width * width) + (height * height));
    };

}
