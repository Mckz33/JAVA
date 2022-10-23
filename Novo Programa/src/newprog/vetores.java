package newprog;

import java.util.Scanner;


public class vetores {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int maior = maior(a, b, c);

        showResult(maior);


    }
    public static int maior(int x, int y, int z){
        int aux;
        if (x > y && x > z){
            aux = x;
        }
        else if (y > z){
            aux = y;
        }
        else aux = z;

        return aux;
    }
    public static void showResult(int value){
        System.out.println("O maior é: " + value);
    }




/*
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i=1; i<=n; i++) {

            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }

 */
/*
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i=1; i<=n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
 */

/*
        Scanner input = new Scanner(System.in);
        System.out.print("repetiçoes: ");
        int n = input.nextInt();
        int  fat = 1;
        for (int i = 1; i <= n; i++){
            fat *= i;
        }
        System.out.println(fat);
 */





 /*
        Scanner input = new Scanner(System.in);
        System.out.printf("Repetiçoes: ");
        int n = input.nextInt();
        float n1 = 0;
        float n2 = 0;
        float soma = 0;

        for (int i = 0; i < n; i++ ){
            System.out.printf("Número 1: ");
            n1 = input.nextInt();
            System.out.printf("Número 2: ");
            n2 = input.nextInt();
            if (n2 == 0){
                System.out.println("Divisão Impossivel! ");
                continue;
            }
            else soma = n1 / n2;
            System.out.println(soma);

        }

  */


/*

        Scanner input = new Scanner(System.in);

        float n1;
        float n2;
        float n3;
        System.out.print("Repetiçoes: ");
        int x = input.nextInt();

        for (int i = 0; i < x; i++){
            n1 = input.nextFloat();
            n2 = input.nextFloat();
            n3 = input.nextFloat();
            float soma = (n1 * 2 + n2 * 3 + n3 * 5) / (2 + 3 + 5);
            System.out.println(soma);
        }


 */



/*
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < 5; i++){
            if (n >= 10 && n <= 20){
                in++;
            }
            else out++;
            n = input.nextInt();
        }
        System.out.printf("in: %d\n" +
                "out: %d\n", in, out);


 */


        /*
                Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = input.nextInt();
        for (int i = 1; i < n; i += 2){
            System.out.println(i);
        }
         */

    }

