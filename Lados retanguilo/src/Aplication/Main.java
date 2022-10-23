package Aplication;

import Programa.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //PASS 1 Object Default
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        //PASSO 2 Declare Object Created.
        Rectangle rectangle = new Rectangle();

        //PASSO 3 Read entry
        System.out.println("Enter rectangle width: ");
        rectangle.width = input.nextDouble();

        System.out.println();
        System.out.println("Enter rectangle width: ");
        rectangle.height = input.nextDouble();

        //PASSO 4 Read exit
        System.out.println();
        System.out.println(rectangle);

    }
}