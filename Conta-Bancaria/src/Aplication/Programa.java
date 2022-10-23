package Aplication;

import Banco.Usuario;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        //PASS 1 Objetos Padroes
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Usuario banco = null;

        //PASS 2 leitura e variaveis para construtor
        System.out.print("Número: ");
        int numero = input.nextInt();
        input.nextLine();

        System.out.print("Conta: ");
        String nomeTitular = input.nextLine();

        double inicialDeposit;
        char i = 0;
        while (true) {
            System.out.print("Deseja fazer um deposito: (s/n)?: ");
            i = input.next().charAt(0);
            if (i == 's') {
                System.out.print("Digite o valor a ser depositado: ");
                inicialDeposit = input.nextDouble();
                banco = new Usuario(numero, nomeTitular, inicialDeposit);
                break;
            } else if (i == 'n') {
                banco = new Usuario(numero, nomeTitular);
                break;
            }
        }

        //PASS 4 SAIDA
        System.out.println();
        System.out.println("Dados da conta: \n" + banco);
        System.out.println();

        System.out.print("Depositar: ");
        double amount = input.nextDouble();
        banco.deposit(amount);
        System.out.println("Dados da conta atualizados! \n" + banco);
        System.out.println();

        System.out.print("Sacar: ");
        amount = input.nextDouble();
        banco.withdraw(amount);
        System.out.println("Dados da conta atualizados! \n" + banco);
        System.out.println();


    }
}