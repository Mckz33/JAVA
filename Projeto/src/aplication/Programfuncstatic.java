package aplication;
import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programfuncstatic {
    public static void main(String[] Args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Funcionarios a registrar: ");
        int x = input.nextInt();
        List<Funcionario> list = new ArrayList<>();

        for (int i = 0; i < x; i++){
            System.out.printf("Funcionario %d", i);
            System.out.print("\nID: ");
            Integer id = input.nextInt();
            System.out.print("Nome: ");
            input.nextLine();
            String nome = input.nextLine();
            System.out.print("Salario: ");
            Double salario = input.nextDouble();
            Funcionario func = new Funcionario(id, nome, salario);
            list.add(func);
        }
        System.out.print("ID do funcionario para aumentar salario: ");
        int idSalario = input.nextInt();
        Integer pos = posicao(list, idSalario);
        if (pos == null){
            System.out.println();
            System.out.println("Este ID não existe!");
            System.out.println();
        }
        else {
            System.out.print("Digite a porcentagem: ");
            Double porcentagem = input.nextDouble();
            list.get(pos).aumentarSalario(porcentagem);
        }
        for (Funcionario func : list){
            System.out.println(func);
        }

    }
    public static Integer posicao(List<Funcionario> list, int valor){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == valor){
                return i;
            }
        }
        return null;
    }
}










/*        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos Funcionarios a registrar: ");
        int x = input.nextInt();
        List<Funcionario> list = new ArrayList<>();

        for (int i = 0; i < x; i++){
            System.out.printf("Funcionario %d: ", i);
            System.out.print("\nID: ");
            Integer id = input.nextInt();
            System.out.print("Nome: ");
            input.nextLine();
            String nome = input.nextLine();
            System.out.print("Salario: ");
            Double salario = input.nextDouble();

            Funcionario func = new Funcionario(id, nome, salario);
            list.add(func);
        }
        System.out.print("ID para ser aumentado: ");
        int idSalario = input.nextInt();
        Integer pos = posicao(list, idSalario);
        if (pos == null) {
            System.out.println("Esse id nao existe!");
        }
        else {
            System.out.print("Entre com a porcentagem: ");
            Double porcentagem = input.nextDouble();
            list.get(pos).aumentarSalario(porcentagem);
        }
        System.out.println();
        for (Funcionario func : list){
            System.out.println(func);
            System.out.println();
        }

    }
    public static Integer posicao(List<Funcionario> list, int id){
         for (int i = 0; i < list.size(); i++){
             if (list.get(i).getId() == id){
                 return i;
             }
         }
         return null;
*/


/*        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Value: ");
        int x = input.nextInt();
        Product[] vetor = new Product[x];

        for (int i = 0; i < vetor.length; i++){
            input.nextLine();
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Price: ");
            double price = input.nextDouble();
            vetor[i] = new Product(nome, price);
        }
        double media = 0;
        for (int i = 0; i < vetor.length; i++){
            media += vetor[i].getPrice();
        }
        double total = media / vetor.length;
        System.out.println(total);

        input.close();*/
