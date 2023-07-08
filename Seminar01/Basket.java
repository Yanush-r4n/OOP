package Seminar01;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> products;

    public Basket(List<Product> products) {
        this.products = products;
    }
    public Basket() {
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }
    private void setProducts(List<Product> products) {
        this.products = products;
    }


    @Override
    public String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            for (Product product : this.products) {
                sb.append("\t- ").append(product).append("\n");
            }
            return sb.toString();
        } catch (NullPointerException exception) {
            return "Корзина пуста.";
        }
    }
}
