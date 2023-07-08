package Seminar01;

import java.util.List;

public class Category {
    private String name;
    private List<Product> products;


    public Category(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }
    public Category() {}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return String.format("%s", name);
    }
}
