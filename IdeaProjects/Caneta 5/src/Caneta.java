public class Caneta {
    private String modelo;
    private String cor;
    private int carga;
    private double ponta;
    private boolean tampada;

    public void status() {
        System.out.println("Modelo " + this.getModelo());
        System.out.println("Cor " + this.getCor());
        System.out.println("Ponta " + this.getPonta());
        System.out.println("Estã tampado " + this.getTampada());
        // System.out.println("Está destampado " + this.);
    }

    //-------------------------------------------------------------------------

    public Caneta(String m, String c, String p) {           // METODO CONSTRUTOR
        this.modelo = m;
        this.cor = c;
        this.ponta = Float.parseFloat(p);
        this.tampar();
    }
    //-----------------------------------------------------------------------------

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

    public boolean getTampada() {

        return this.tampada;
    }

    public void setTampada(boolean t) {

        this.tampada = t;
    }

    public void tampar() {

        this.tampada = true;
    }

    public void destampar() {

        this.tampada = false;
    }
}
