package Aluno;

public class AnoLetivo {
    //ATRIBUTOS
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    //METODOS
    public double faltaNotas(){
        return 60 - mediaNotas();
    }
    public double mediaNotas(){
        return nota1 + nota2 + nota3;
    }
    public String toString(){
        return "FINAL GRADE = " + mediaNotas();
    }

}
