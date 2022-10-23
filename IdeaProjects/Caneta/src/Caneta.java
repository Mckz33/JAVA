// CLASSE
// Obs: deixar sempre a classe em otimo estado, redondinha assim nao terá que se preocupar.
// Atributo, Metodo, Estado.
// https://www.youtube.com/watch?v=wNaoX6VOj54&list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY&index=4

public class Caneta {

    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;


    void status() {
        System.out.println("A Caneta é " + this.cor);
        System.out.println("O modelo é " + this.modelo);
        System.out.println("A ponta é " + this.ponta);
        System.out.println(this.carga + "% de carga");
        System.out.println("Está " + this.tampada);

    }

    public void Rabiscar() {
        if (this.tampada == true) {
            System.out.println("Não posso rabiscar! ");

        } else {
            System.out.println("Estou Rabiscando! ");
        }

    }


    public void Tampar() {
        this.tampada = true;

    }

    public void Destampada() {
        this.tampada = false;

    }


}

