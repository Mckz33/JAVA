package entidades;;
public class Produto {
    private String name;
    private double price;

    public Produto(String nome, double price){
        this.name = nome;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name += name;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price += price;
    }
    public String toString(){
        return "Nome: " + name + "\n" +
                " Preço: " + price;
    }
}
