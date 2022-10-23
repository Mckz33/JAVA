package praticarProva;
import javax.management.monitor.StringMonitor;
import java.util.*;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Funcionario> list = new ArrayList<>();

        System.out.print("Quantos funcionarios: ");
        int x = input.nextInt();

        for (int i = 0; i < x; i++ ){
            System.out.printf("Funcionario %d: ", i+1);
            System.out.print("\nID: ");
            Integer id = input.nextInt();
            System.out.print("Nome: ");
            input.nextLine();
            String nome = input.nextLine();
            System.out.print("Salario: ");
            Double salario = input.nextDouble();
            Funcionario funcionario = new Funcionario(id, nome, salario);
            list.add(funcionario);
        }


        System.out.println(list);



















//    Map<String, String> cook = new TreeMap<>();
//
//    cook.put("nome", "Maria");
//    cook.put("telefone", "193812983193");
//
//    for (String key : cook.keySet()){
//        System.out.println(key + ": " + cook.get(key));
//    }

//========================================================================
//        Map<Product, Double> stock = new HashMap<>();
//        Product p1 = new Product("TV", 900.00);
//        Product p2 = new Product("iPhone", 5000.00);
//        Product p3 = new Product("iPad", 3000.00);
//
//        stock.put(p1, 10000.0);
//        stock.put(p2, 20000.0);
//        stock.put(p3, 15000.0);
//
//        Product ps = new Product("TV", 900.0);
//        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

    }
}
