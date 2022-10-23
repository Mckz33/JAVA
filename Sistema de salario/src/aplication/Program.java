package aplication;

import intitities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        //pass 1 declarar objetos padrão
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        //pass 2 declarar variaveis e leitura para o construtor
        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Price: ");
        double price = input.nextDouble();

        System.out.print("Quantity: ");
        int quantity = input.nextInt();

        //pass 3 declarar new objeto
        Product product = new Product(name, price, quantity);

        //passo 4 declarar saida
        System.out.println("Product data " + product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        quantity = input.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = input.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);
        System.out.println();

































/*
//PASS 1
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);



        //PASS 3
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Price: ");
        double price = input.nextDouble();

        System.out.print("Quantity: ");
        int quantity = input.nextInt();

        //PASS 2
        Product product = new Product(name, price, quantity);

        //PASS 4
        System.out.println("Product data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        quantity = input.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: " + product);

        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = input.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);

 */
/*

        //PASS 1 Chamar os objetos padrão.
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        //PASS 2 Leitura e variaveis
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
        System.out.print("Products in stock: ");
        int quantity = input.nextInt();

        //PASS 3 declarar objeto
        Product product = new Product(name, price, quantity);

        //PASS 4 Saida do objeto
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = input.nextInt();
        product.addProducts(quantity);
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = input.nextInt();
        product.removeProduct(quantity);
        System.out.println("Product data: " + product);


 */

/*
            //PASSO 1
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        //PASSO 2
        Product product = new Product();

        //PASSO 3
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = input.nextLine();
        System.out.print("Price: ");
        product.price = input.nextDouble();
        System.out.print("Products in Stock: ");
        product.quantity = input.nextInt();

        //PASSO 4 SAIDA + ADD + REMOVED
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = input.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = input.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);

        input.close();

 */

    }
}
