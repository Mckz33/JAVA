package Aplication;

import entidade.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) { //NEWWWW PROGRAM
        //PASSO 1 - OBJETO LEITURA e LOCALE.
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        //PASSO 2 - CHAMAR E DECLARAR O OBJETO TRIANGLE.
        Triangle x = new Triangle(), y = new Triangle();

        //PASSO 3 - FAZER A LEITURA DAS VARIAVEIS.
        System.out.println("Enter the measures of triangle X");
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();
        System.out.println("Enter the measures of triangle Y");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();

        //PASSO 4 - CALCULAR A AREA DO TRIANGLE.
        double areaX = x.area();
        double areaY = y.area();

        //PASSO 5 - PRINTAR O RESULTADO.
        System.out.printf("Triangle X area: %.4f\n", areaX);
        System.out.printf("Triangle Y area: %.4f\n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }
        else System.out.println("Larger area: Y");























        //PASSO 1 - OBJETO LEITURA e LOCALE.
        //PASSO 2 - CHAMAR E DECLARAR O OBJETO TRIANGLE.
        //PASSO 3 - FAZER A LEITURA DAS VARIAVEIS.
        //PASSO 4 - CALCULAR A AREA DO TRIANGLE.
        //PASSO 5 - PRINTAR O RESULTADO.



/*
        //PASSO 1 - OBJETO LEITURA e LOCALE.
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        //PASSO 2 - CHAMAR E DECLARAR O OBJETO TRIANGLE.
        Triangle x = new Triangle(), y = new Triangle();

        //PASSO 3 - FAZER A LEITURA DAS VARIAVEIS.
        System.out.println("Enter the measures of triangle X: ");
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();

        //PASSO 4 - CALCULAR A AREA DO TRIANGLE.
        double areaX = x.area();
        double areaY = y.area();

        //PASSO 5 - PRINTAR O RESULTADO.
        System.out.printf("Triangle X area: %.4f\n", areaX);
        System.out.printf("Triangle Y area: %.4f\n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area X");
        }
        else System.out.println("Larger area X");


 */

    }
}