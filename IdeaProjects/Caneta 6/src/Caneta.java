import java.lang.constant.Constable;

public class Caneta {
    private String modelo;
    private String cor;
    private double ponta;

    // public Caneta(String m, String c, double p) {
    //   this.modelo = m;
    //  this.cor = c;
    //this.ponta = p;
    //}

    //================================================

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public double getPonta() {
        return this.ponta;
    }

    public void setPonta(double p) {
        this.ponta = p;
    }

    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor " + this.getCor());
        System.out.println("Ponta " + this.getPonta());
    }

}
