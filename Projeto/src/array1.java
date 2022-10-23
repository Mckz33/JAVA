import java.util.Locale;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Número: ");
        int x = input.nextInt();
        int[] vetor = new int[x];
        int[] vetorn = new int[vetor.length];


        for (int i = 0; i < vetor.length; i++){
            System.out.print("Posição valor: ");
            int num = input.nextInt();
            if (num < 0){
                vetorn[i] = num;
            }
            else vetor[i] = num;
        }
        for (int i = 0; i < vetorn.length; i++){
            System.out.print(vetorn[i] + ", ");
        }

    }
}