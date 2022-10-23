package Banco;

public class Usuario {
    //ATRIBUTOS
    private int numero;
    private String nomeTitular;
    private double saldo;

    //CONSTRUTOR
    public Usuario(int numero, String nomeTitular) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
    }

    public Usuario(int numero, String nomeTitular, double inicialBalance) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        deposit(inicialBalance);
    }
    //METODOS

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposit(double amount) {
        this.saldo += amount;
    }

    public void withdraw(double amount) {
        double saldoTotal = this.saldo -= amount + 5;
    }

    public String toString(){
        return "Conta, "
                + numero
                + ", Nome do titular: "
                + nomeTitular
                + ", Saldo: $ "
                + String.format("%.2f", saldo);
    }
}
