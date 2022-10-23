package intitities;

public class Product {
    //ATRIBUTOS
    public String name;
    public double price;
    public int quantity;

    //CONTRUTOR = força o usuario a colocar valores.
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //METODOS
    public double totalValueInStock(){
        return quantity * price;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return name + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }

































/*
    //ATRIBUTOS
    public String name;
    public double price;
    public int quantity;

    //CONSTRUTOR
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //METODOS

    public double totalValueInStock(){
        return quantity * price;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return name + ", $ "
                + String.format("%.2f", price)
                + ", " + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());

    }


 */

    /*

    //ATRIBUTOS
    public String name;
    public double price;
    public int quantity;

    //CONSTRUTOR
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    //METODOS
    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProduct(int quantity){
        this.quantity -= quantity;
    }
    //toString = Transformar Objeto em String
    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }



     */

    /*

   //ATRIBUTOS
    public String name;
    public double price;
    public int quantity;

    //METODOS
    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    //toString
    public String toString(){
        return name + ", $" +
                String.format("%.2f", price) + ", " +
                quantity +
                " units, " +
                "Total: $ " +
                String.format("%.2f", totalValueInStock());
    }

     */


}
