package triagulo;
/* Essa class é para poder utilizar em outros códigos, não necessáriamente em um só.
Isso permite um código mais limpo na outra class e premite reutilizar esse "package"
mais vezes em outros lugares.

===> Aqui por exemplo estamos criando as variáveis para outro código.
*/



public class trianglePOO {

    public double a;
    public double b;
    public double c;

    /*
     * --> "public" nas variáveis permite que essa class seja utilizada em várias
     * outras
     * classes / vários outros arquivos.
     * 
     * --> "private" significa que poderá ser utilizada apenas na class específica
     * (acredito que apenas nessa mesmo?).
     * 
     * --> "protected" apenas na mesma classe e subclasses.
     * 
     */

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
