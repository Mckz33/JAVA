public class Caneta {

    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampado;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println(this.carga + "% Carga");
        System.out.println("Está tampado?" + this.tampado);

    }

    public void rabiscar() {
        if (this.tampado == true) {
            System.out.println("Não Posso Rabiscar!");
        } else {
            System.out.println("Estou Rabiscando! ");
        }

    }

    public void tampar() {
        this.tampado = true;
    }

    public void destampado() {
        this.tampado = false;
    }
}
