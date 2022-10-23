package entities;

public class Funcionario {
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario(Integer id, String nome, Double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }
    public Double aumentarSalario(Double porcentagem){
        return this.salario += this.salario * 10 / 100;
    }

    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Double getSalario(){
        return this.salario;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }
    public String toString(){
        return "ID: " + this.id +
                "\n" + "Nome: " + this.nome +
                "\n" + "Salario: " + this.salario;
    }
}
