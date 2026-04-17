package avaliacaoAluno;

//import avaliacaoAluno.aluno;

public class alunoPOO {

    public double nota1;
    public double nota2;
    public double nota3;

    public double finalNota(){
        double finalNota;
        return finalNota = nota1 + nota2 + nota3;
    }

    public double restante(){
        double restante;
        return restante = 60.00 - finalNota();
    }
}
