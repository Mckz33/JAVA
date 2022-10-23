package Programa;

public class Rectangle {
    //ATRIBUTOS
    public double width;
    public double height;

    //METODOS

    public double area(){
        return width * height;
    }
    public double perimeter(){
        return width + height + width + height;
    }
    public double diagonal(){
        return Math.sqrt(width * height + width * height);
    }
    public String toString(){
        return "AREA = " + String.format("%.2f",area())
                + "\nPERIMETER = " + String.format("%.2f", perimeter())
                + "\nDIAGONAL = " + String.format("%.2f", diagonal());
    }
}
