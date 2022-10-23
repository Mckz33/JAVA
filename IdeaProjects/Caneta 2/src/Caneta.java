// atributo
public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    public void status() {
        System.out.println("O modelo é " + this.modelo);
        System.out.println("A cor é " + this.cor);
        System.out.println("Usando a ponta " + this.ponta);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println(this.carga + " % de Carga");
        
    }


    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Não consigo rabiscar!");

        } else {
            System.out.println("Estou Rabiscando!");
        }

    }

    public void tampar() {
        this.tampada = true;

    }

    public void destampado() {
        this.tampada = false;

    }

}
