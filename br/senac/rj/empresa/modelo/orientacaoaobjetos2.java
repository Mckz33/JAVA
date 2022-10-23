package br.senac.rj.empresa.modelo;
import java.util.*;

public class orientacaoaobjetos2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Funcionarios> list = new ArrayList<>();


        System.out.print("Número de funcionarios: ");
        int x = input.nextInt();


        for (int i = 0; i < x; i++){
            System.out.printf("Funcionario %d", i+1);
            System.out.print("\nRegistro: ");
            Integer registro = input.nextInt();
            System.out.print("Cargo: ");
            Integer cargo = input.nextInt();
            System.out.print("Salario: ");
            Double salario = input.nextDouble();
            Funcionarios funcionario = new Funcionarios(registro, cargo, salario);
            list.add(funcionario);
            funcionario.aplicarBonificacao(cargo);
        }

        for (Funcionarios func : list){
            System.out.println(func);
        }

        System.out.println("\nFim");
        input.close();
    }
}
