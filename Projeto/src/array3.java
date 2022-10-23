import java.util.Locale;
import java.util.Scanner;

public class array3 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int numero = input.nextInt();
        String[] nome = new String[numero];
        int[] idade = new int[numero];
        String[] menorNome = new String[idade.length];
        int [] menorIdade = new int[idade.length];
        double[] altura = new double[numero];

        int cont = 0;
        for (int i = 0; i < numero; i++){
            input.nextLine();
            System.out.print("Nome: ");
            nome[i] = input.nextLine();

            System.out.print("Idade: ");
            idade[i] = input.nextInt();

            if (idade[i] < 16){
                menorNome[cont] = nome[i];
                menorIdade[cont] = idade[i];
                cont++;
            }

            System.out.print("Altura: ");
            altura[i] = input.nextDouble();

        }

        double media = 0;
        for (int i = 0; i < numero; i++){
            media += altura[i];
        }

        int cal = 0;
        for (int i = 0; i < menorIdade.length; i++){
            cal = 100 / numero;
        }

        double alt = media/numero;
        System.out.printf("Altura média: %.2f ", alt);
        System.out.println();
        System.out.printf("Pessoas com menos de 16 anos: %d%% ", cal);
        System.out.println();

        for (int i = 0; i < cont; i++){
            System.out.println(menorNome[i]);
        }

    }
}
