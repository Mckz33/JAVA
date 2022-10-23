import java.util.Locale;
import java.util.Scanner;

public class array2 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Número: ");
        int num = input.nextInt();
        double[] vetor = new double[num];

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um número: ");
            double value = input.nextDouble();
            vetor[i] = value;
        }
        double soma = 0;
        double media = 0;

        for (int i = 0; i < vetor.length; i++){
            System.out.print("VALORES = " + vetor[i] + ", ");
            soma += vetor[i];
            media = soma/vetor.length;
        }
        System.out.println();
        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + media);


    }
}
