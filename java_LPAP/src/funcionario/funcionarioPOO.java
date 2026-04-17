package funcionario;

import funcionario.funcionario;

public class funcionarioPOO {


    public String nome;
    public double salarioBruto;
    public double tax;
    double percent;

    public double totalS(){
       double totalS;
        return totalS = salarioBruto - tax;
    }

    public double totalPerc(){
        double totalPerc;
        return totalPerc = (salarioBruto + (salarioBruto * percent/100.00)) - tax;
        }
}
