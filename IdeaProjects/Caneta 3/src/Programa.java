public class Programa {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Preta";
        c1.carga = 95;
        c1.ponta = 0.5;
        c1.tampar();
        c1.status();
        c1.rabiscar();

    }

}
