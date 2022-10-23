public class Caneta {
    public String modelo;
    public String cor;
    public double ponta;
    protected int carga;
    boolean tampado;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Está Tampado? " + this.tampado);

    }

    public void rabiscar() {
        if (this.tampado == true) {
            System.out.println("-----Não consigo rabiscar!-----");
        } else {
            System.out.println("-----Estou rabiscando!-----");
        }

    }

    protected void tampar() {
        this.tampado = true;

    }

    protected void destampado() {
        this.tampado = false;

    }

}
