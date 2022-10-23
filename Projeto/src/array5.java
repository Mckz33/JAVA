import java.util.Locale;
import java.util.Scanner;

public class array5 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Número: ");
        int x = input.nextInt();
        float[] vetor = new float[x];

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Vetor: ");
            vetor[i] = input.nextFloat();
        }

        float maior = 0;
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] > maior){
                maior = vetor[i];
            }
        }
        System.out.println(maior);

        System.out.println(maior);
        // FALTA IMPRIMR A POSIÇAO DO MAIOR NUMMERO

        input.close();
    }
}