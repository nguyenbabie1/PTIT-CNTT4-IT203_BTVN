package Sessoin9.Bai5;

public class ProductionEmployee extends Employee {
    private int numOfProducts;
    private double price;

    public ProductionEmployee(String name, int numOfProducts, double price) {
        super(name);
        this.numOfProducts = numOfProducts;
        this.price = price;
    }

    public double calculateSalary() {
        return numOfProducts * price;
    }
}
