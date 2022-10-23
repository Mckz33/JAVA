package newprog;

import java.util.Scanner;



public class newprog{
    public static void main(String[]args){
/*
        String nome = "Maria";
        int idade = 33;
        double renda = 2000.4;
        System.out.printf("%s tem %d anos e recebe R$%.2f reais.", nome, idade, renda);

 */


/*
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota: ");
        float nota = teclado.nextFloat();
        System.out.printf("A nota do %s é: %.2f\n", nome, nota);
 */


        /*
        String valor = "30";
        float idade = Float.parseFloat(valor);
        System.out.println(idade);
         */


        /*
        Passo 1- criar o objeto
        Passo 2- criar variavel chamando o Objeto
         */

/*
        // Depois de importar é necessario ativar o "OBJETO"
        Scanner sc = new Scanner(System.in); // Scanner é o Objeto. new é a construção de um objeto. (System.in) é a entrada.
        String x = sc.nextLine(); //.next é a leitura do conteudo até o espaço. .nextLine lê o conteudo até a quebra da linha.
        System.out.printf("Nome: %s\n", x); // X usado para a saída.
 */

/*
            // Objeto
    Scanner sc = new Scanner(System.in);
    // Nome
    System.out.println("Nome: ");
    String nome = sc.next();
    // Cep "."
    System.out.println("6 digitos do CEP ( . ): ");
    float pcep = sc.nextFloat();
    // Cpf "."
    System.out.println("CPF ( . )");
    double pcpf = sc.nextDouble();
    // Idade
    System.out.print("idade: ");
    byte idade = sc.nextByte();
    // Ano
    System.out.print("Ano: ");
    short ano = sc.nextShort();
    // Cep
    System.out.print("CEP: ");
    int cep = sc.nextInt();
    // CPF
    System.out.println("CPF: ");
    long cpf = sc.nextLong();

    // Saidas
    System.out.printf("Nome: %s\n ", nome);
    System.out.printf("CEP: %.3f\n", pcep);
    System.out.println("CPF ( . )\n" + pcpf);
    System.out.printf("Idade: \n" + idade);
    System.out.printf("Ano: \n" + ano);
    System.out.printf("CEP: \n" + cep);
    System.out.println("CPF: \n");

*/
    Scanner sc = new Scanner(System.in);
    System.out.printf("Digite um número: ");
    int A = sc.nextInt();
    int B = sc.nextInt();

    if (A % B == 0 || B % A == 0) {
        System.out.println("Sao Multiplos");
        System.out.println(A + B);
    }
    else {
        System.out.println("Nao sao Multiplos");
    }


    }
}