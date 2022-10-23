package br.senac.rj.empresa.modelo;

public class Funcionarios {
    // ATRIBUTOS
    private Integer registro;
    private Integer cargo;
    private Double salario;

    // CONSTRUTOR
    public Funcionarios(int registro, int cargo, double salario){
        this.registro = registro;
        this.cargo = cargo;
        this.salario = salario;
    }
    // METODOS
    public void aplicarBonificacao(Integer cargo){
        if (cargo == 1){
            this.salario += this.salario * 20 / 100;
        }
        else if (cargo == 2){
            this.salario += this.salario * 40 / 100;
        }
        else if (cargo == 3){
            this.salario += this.salario * 60 / 100;
        }
        else{
            this.salario += this.salario * 0 / 100;
        }
    }

    @Override
    public String toString() {
        return "\nFuncionario:\n" +
                "registro = " + registro +
                "\ncargo = " + cargo +
                "\nsalario = " + salario;
    }
}
