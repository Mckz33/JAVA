import java.text.DecimalFormat;
import java.text.Format;

public class Programa {

    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.carga = 100;
        c1.ponta = 0.5;
        c1.status(); // todo metodo tem ()
        c1.Tampar(); // alterar para Tampar e Destampar
        c1.Rabiscar();


        System.out.println("--------------------------------");

        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Preta";
        c2.carga = 78;
        c2.ponta = 0.8;
        c2.status(); // todo metodo tem ()
        c2.Destampada(); // alterar para Tampar e Destampar
        c2.Rabiscar();

    }

}
