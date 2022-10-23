package aplicativo;

import entidades.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String[] vetor = new String[5];
        for (int i = 0; i < vetor.length; i++){
            System.out.print("Letra: ");
            String letra = input.nextLine();
            if (letra.length() > 2){
                System.out.println("MUITAS LETRAS!");
            }
            vetor[i] = letra;
        }
        String soma = "";
        for (int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }
        System.out.println(soma);

/*
        System.out.print("Value: ");
        int x = input.nextInt();
        Produto[] vetor = new Produto[x];

        for (int i = 0; i < vetor.length; i++){
            input.nextLine();
            String nome = input.nextLine();
            double price = input.nextDouble();
            vetor[i] = new Produto(nome, price);
        }
        double soma = 0;
        for (int i = 0; i < vetor.length; i++){
            soma += vetor[i].getPrice(); // Em 2 espaços de uma memoria .getPrice() dps do vetor destaca o price do array da posiçao, pq nao é possivel somar a string.
        }
        double res = soma / vetor.length;
        System.out.printf("%.2f", res);
*/

    }

}