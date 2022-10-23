package Aplication;

import Program.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //PASS 1
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        //PASS 2
        Employee empregado = new Employee();

        //PASS 3
        System.out.print("Nome: ");
        empregado.nome = input.nextLine();

        System.out.print("Salario bruto: ");
        empregado.salarioBruto = input.nextDouble();

        System.out.print("Imposto: ");
        empregado.imposto = input.nextDouble();

        //PASS 3
        System.out.println("Empregado: " + empregado);

        System.out.println();
        System.out.print("Qual a porcentagem para aumentar o Salario: ");
        double porcentagem = input.nextDouble();
        empregado.aumentarSalario(porcentagem);
        System.out.print("Salario atualizado: " + empregado.salarioBruto);
    }
}