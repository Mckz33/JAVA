package Program;

public class Employee {
    //ATRIBUTOS
    public String nome;
    public double salarioBruto;
    public double imposto;

    //METODOS
    public double salarioLiquido(){
        return salarioBruto - imposto;
    }
    public void aumentarSalario(double porcentagem){
        salarioBruto = (salarioBruto * porcentagem /100) + salarioLiquido();
    }
    public String toString(){
        return nome + ", $ " + salarioLiquido();
    }
}
