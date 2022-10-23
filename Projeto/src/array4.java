import java.util.Locale;
import java.util.Scanner;

public class array4 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int x = input.nextInt();

        int[] vetpar = new int[x];
        int[] vetimp = new int[x];
        int cpar = 0;
        int cimp = 0;

        int i = 0;
        while (i < x){
            System.out.print("Digite um número: ");
            int num = input.nextInt();
            if (num % 2 == 0){
                vetpar[cpar] = num;
                cpar++;
            }
            else vetimp[cimp] = num;
            cimp++;
            i++;

        }
        System.out.println("NUMEROS PARES:");
        i = 0;
        while (i < cpar){
            System.out.print(vetpar[i] + " ");
            i++;

        }
        System.out.println();
        System.out.print("QUANTIDADE DE PARES = " + cpar);


    }
}
