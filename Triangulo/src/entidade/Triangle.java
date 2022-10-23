package entidade;

// CLASSE
public class Triangle {
    //ATRUBUTOS
    public double a;
    public double b;
    public double c;

    //METODOS
    public double area(){
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p *(p - a) * (p - b) * (p - c));
    }

































/*
    // ATRIBUTOS
    public double a;
    public double b;
    public double c;

    // METODOS
    public double area(){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

 */
}
