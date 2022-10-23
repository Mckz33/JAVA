package Programa;

import Aluno.AnoLetivo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //PASSO 1
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        //PASSO 2
        AnoLetivo anoletivo = new AnoLetivo();

        //PASSO 3
        System.out.print("Nome do aluno: ");
        anoletivo.nome = input.nextLine();

        System.out.print("Primeira nota: ");
        anoletivo.nota1 = input.nextDouble();

        System.out.print("Segunda nota: ");
        anoletivo.nota2 = input.nextDouble();

        System.out.print("Terceira Nota: ");
        anoletivo.nota3 = input.nextDouble();

        //PASSO 4
        System.out.println(anoletivo);

        if (anoletivo.mediaNotas() > 60) {
            System.out.println("APROVADO! ");
        }
        else System.out.println("REPROVADO!");
        System.out.println("FALTOU: " + anoletivo.faltaNotas());

    }
}