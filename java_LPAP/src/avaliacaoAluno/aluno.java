package avaliacaoAluno;

import java.util.Scanner;
//import avaliacaoAluno.alunoPOO;

public class aluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;

        alunoPOO avali;
        avali = new alunoPOO();

        System.out.println("Digite o nome do aluno: ");
        nome = sc.nextLine();

        System.out.println("A nota do 1° Trimestre (máx 30): ");
        avali.nota1 = sc.nextDouble();

        System.out.println("A nota do 2° Trimestre (máx 35): ");
        avali.nota2 = sc.nextDouble();

        System.out.println("A nota do 3° Trimestre (máx 35): ");
        avali.nota3 = sc.nextDouble();

        double finalNota = avali.finalNota();

        System.out.printf("NOTA FINAL = %.2f%n", finalNota);
        System.out.println("ALUNO: " + nome);

        if (finalNota >= 60) {
            System.out.println("\n APROVADO");
        }
        else {
            System.out.println("\n REPROVADO");
            double restante = avali.restante();
            System.out.printf("FALTAM = %.2f%  PONTOS.", restante);
        }


    }
}
