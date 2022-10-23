package aplication;

import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] Args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos funcionarios será regitrado: ");
        int x = input.nextInt();
        List<Funcionario> list = new ArrayList<>();

        for (int i = 0; i < x; i++){
            System.out.println("Funcionario " + i);
            System.out.print("ID: ");
            Integer id = input.nextInt();
            input.nextLine();
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Salario: ");
            Double salario = input.nextDouble();

            Funcionario funcionario = new Funcionario(id, nome, salario);
            list.add(funcionario);
            if (i == x - 1){
                System.out.print("Entra com o ID do funcionario que ganhará aumento: ");
                Double aumentarSalario = input.nextDouble();

            }
        }

        for (Object func : list){
            System.out.println(func);
        }


































        /*Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos clientes será registrado: ");
        int cliente = input.nextInt();

        List<Funcionario> list = new ArrayList<>();

        for (int i = 0; i < cliente; i++){
            input.nextLine();
            System.out.print("ID: ");
            Integer id = input.nextInt();
            input.nextLine();
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Salario: ");
            Double salario = input.nextDouble();

            Funcionario func = new Funcionario(id, nome, salario);
            list.add(func);
        }

        for (Object List : list){
            System.out.println("----------------------------------");
            System.out.print(List);
            System.out.println();
            System.out.println("----------------------------------");
        }

        input.close();*/
    }
}
