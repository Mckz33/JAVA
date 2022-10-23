package praticarProva;

import java.security.PrivateKey;

public class Funcionario {
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario(Integer id, String nome, Double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;

    }

    public Integer getId() {
        return id;
    }
    public String getNome(){
        return this.nome;
    }
    public void getSalario(Double Salario){
        this.salario = salario;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }
    public void aumentarSalario(Integer porcentagem){
        this.salario += this.salario * porcentagem / 100;
    }

}
