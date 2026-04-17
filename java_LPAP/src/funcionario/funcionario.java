package funcionario;

import java.util.Scanner;
import funcionario.funcionarioPOO;

public class funcionario {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

    funcionarioPOO func;
    func = new funcionarioPOO();

    System.out.println("Informe o nome: ");
    func.nome = sc.nextLine();

    System.out.println("Informe o valor do salário bruto: ");
    func.salarioBruto = sc.nextDouble();

    System.out.println("Informe valor do imposto: ");
    func.tax = sc.nextDouble();

    double total = func.totalS();

    System.out.println("Funcionário: " + func.nome);
    System.out.printf("Salario: R$ %.2f%n", total);

    System.out.println("\n Qual a porcentagem de aumento do salário? \n Porcentagem: ");
    func.percent = sc.nextDouble();

    double totalPercent = func.totalPerc();

    System.out.println("Informações Atualizadas: \n Funcionário: " + func.nome);
    System.out.printf("Salario: R$ %.2f%n", totalPercent);

}
}
