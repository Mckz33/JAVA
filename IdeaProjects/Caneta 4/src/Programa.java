public class Programa {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Preto";
        c1.ponta = 0.8;
        c1.carga = 78;
        c1.destampado();
        c1.status();
        c1.rabiscar();

    }

}
