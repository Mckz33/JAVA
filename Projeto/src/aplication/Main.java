package aplication;

import entities.Quarto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Clientes: ");
        int clientes = input.nextInt();
        Quarto[] quarto = new Quarto[10];

        for (int i = 0; i < clientes; i++){
            input.nextLine();
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();
            System.out.print("Numero do Quarto: ");
            int numeroQuarto = input.nextInt();

            quarto[numeroQuarto] = new Quarto(nome, email, numeroQuarto);
        }

        //extrutura forEach (tipo e nome : apelido)
        for (Object Quarto : quarto){
            if (Quarto != null){
                System.out.println(Quarto);
            }

        }



























/*        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos quartos será alugado: ");
        int x = input.nextInt();
        Quarto[] quartos = new Quarto[10];

        for (int i = 1; i <= x; i++){
            System.out.println("Rent #" + i);
            input.nextLine();
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();
            System.out.print("Quarto: ");
            int quarto = input.nextInt();

            quartos[quarto] = new Quarto(nome, email, quarto);
        }

        System.out.println("Quartos alugados:");
        for (int i = 0; i < 10; i++){
            if (quartos[i] != null){
                System.out.println(quartos[i]);
            }
        }

        input.close();*/
    }
}
