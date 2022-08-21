package _07poo.encapsulamento.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {} // construtor padrao

    // construtor tem o mesmo nome da classe sem tipo de retorno
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // sobrecarga - construtor personalizado
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }

    public void setName(String name) {this.name = name;}

    public double getPrice() { return price; }

    public void setPrice(double price) {this.price = price;}

    public double totalValueInStock() {
        return price * quantity;
    }

    public int getQuantity() { return quantity; } // quantity só pode ser alterada usando addProducts e removeProducts

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $"
                + String.format("%.2f", totalValueInStock());
    }
}

/*
    private - só pode ser acessada dentro da própria classe
    (nada) - só pode ser acessado nas classes do mesmo pacote
    protected - só pode ser acessado no mesmo pacote e em subclasses de pacotes diferentes
    public - pode ser acessado por todas classes
    atributos não podem ser acessíveis publicamente;
    utilizar getters e setters
 */
