package veiculo;

import java.util.Scanner;

public class Veiculo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VeiculoPOO c = new VeiculoPOO();

        System.out.println("INFORMAÇÕES DO VEÍCULO \n ");

          System.out.println("\n Informe a marca: ");
         c.marca = sc.nextLine();

         System.out.println("Informe o modelo: ");
         c.modelo = sc.nextLine();

         System.out.println("Informe o ano de fabricação: ");
         c.anoFabri = sc.nextInt();

         System.out.println("Informe o valor da diária: ");
         c.diaria = sc.nextDouble();

         System.out.println("\n VEÍCULO: \n MARCA: " + c.marca + "\n MODELO: " + c.modelo +
                           "\n ANO DE FABRICAÇÃO: " + c.anoFabri + "\n VALOR DA DIÁRIA: " + c.diaria);

         System.out.println("\n \n Deseja alugar ou devolver o veículo? \n Digite '1' para alugar \n OU \n Digite '2' para devolver: ");
         c.decisao = sc.nextInt();

         System.out.println(c.decisao());


    }
    
}


