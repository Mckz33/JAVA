import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class demoList {
     public static void main(String[] Args){
         Locale.setDefault(Locale.US);
         Scanner input = new Scanner(System.in);

         // Declarando uma list vazia.
         // 1.Lista<TIPO> apelido = new ArrayList<>();
         List<String> list = new ArrayList<>();
         List<Integer> list1 = new ArrayList<>();

         // adicionando e removendo valores a lista.
         list.add("Mandioca");
         list.add("Na");
         list.add("Priquita");
         list.add(1,"Minha casseta cabeluda");
         list.remove(1);
         list.add("rola");

         list1.add(2);
         list1.add(33);
         list1.add(1, 34);

         // checando o tamanho da lista.
         System.out.println("Tamanho do Bagaço: " + list.size());

         // Pegar uma valor x e retornar x.charAt(0) == 'M'
         list.removeIf(x -> x.charAt(0) == 'M');

         // Encontrar um elemento.
         System.out.println("INDEX: " + list1.indexOf(2));

         // Laço para percorrer uma lista e um vetor.
         for (Integer y : list1){
              System.out.println(y);
         }

         for (String x : list){
             System.out.println(x);
         }


         input.close();
     }
}
