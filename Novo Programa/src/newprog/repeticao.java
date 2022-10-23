package newprog;

import java.util.Scanner;

public class repeticao {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= 3; i ++){
            System.out.printf("[", i,"]", i);
            for (int j = 0; j <= 3; j ++){
                System.out.printf("[", j,"]", j);
            }
        }




/*
        Scanner input = new Scanner(System.in);

        int n, s = 0;
        String resp;

        do {
            System.out.print("Digite um numero: ");
            n = input.nextInt();
            s += n;
            System.out.print("Quer continuar? [S/N] ");
            resp = input.next();
        } while (resp.equals("s"));
        System.out.println("A soma de todos os numeros são: "+ s);



 */


/*
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        int i = 0;
        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("Primeiro! ");
            }
            else if (x < 0 && y > 0) {
                System.out.println("Segundo! ");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Terceiro! ");
            }
            else System.out.println("Quarto! ");

            x = input.nextInt();
            y = input.nextInt();

        }
 */


        /*
                Scanner input = new Scanner(System.in);
        System.out.print("===MENU===\n" +
                "1.Alcool\n" +
                "2.Gasolina\n" +
                "3.Diesel\n" +
                "4.Fim\n" +
                "Escolha uma opção: ");

        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;


        int i = 1;
        while (i != 0){
            int op = input.nextInt();
            if (op == 1){
                gasolina += 1;
            }
            else if (op == 2){
                alcool += 1;
            }
            else if (op == 3){
                diesel += 1;
            }
            else if (op == 4) {
                System.out.printf("FIM!");
                System.out.printf("=== Muito Obrigado! ===\n" +
                        "Gasolina: %d\n" +
                        "Alcool: %d\n" +
                        "Diesel: %d\n ", gasolina, alcool, diesel);
                break;

            }
            else {
                System.out.println("Númemro invalido! ");
            }
        }

         */



/*
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        int i = 0;
        while (x != 0 && y != 0){

            if (x > 0 && y > 0) {
                System.out.println("Primeiro! ");
            }
            else if (x < 0 && y > 0) {
                System.out.println("Segundo! ");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Terceiro! ");
            }
            else System.out.println("Quarto! ");

            x = input.nextInt();
            y = input.nextInt();

        }
 */

/*
        Scanner input = new Scanner(System.in);
        System.out.println("Crie uma senha:\n ");
        int senha = input.nextInt();
        System.out.println("Senha criada com sucesso.\n");

        int i = 0;
        while (i != senha){
                System.out.println("Entre com a senha:\n ");
                i = input.nextInt();
                if (i != senha){
                    System.out.println("Senha Invalida:\n ");
                }

        }
        System.out.println("Logado com sucesso!");

 */

    }
}

