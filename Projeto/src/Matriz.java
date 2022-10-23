import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Tamanho da Matriz: ");
        int x = input.nextInt();
        int[][] matriz = new int[x][x];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf("Matriz %d %d: ", i, j);
                matriz[i][j] = input.nextInt();

            }

        }
        for (int i = 0; i < matriz.length; i++){
            System.out.println();
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print("[" +matriz[i][j] + "]");

            }
        }
        System.out.println("Diagonal Principal: ");
        for (int i = 0; i < matriz.length; i++){
            System.out.println("[" + matriz[i][i] + "]");
        }
        int cont = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; i++){
                if (matriz[i][j] < 0){
                    cont++;
                }
            }
        }
    }
}
