package Seminar01;

public class Product {
    private String name;
    private Double price;
    private Integer rating;

    public Product(String name, Double price, Integer rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    public Product() {
        this("", 0.00, 0);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        if (price <= 0) {
            System.out.println("Некорректная цена.");
        } else {
            this.price = price;
        }
    }

    public Integer getRating() {
        return rating;
    }
    public void setRating(Integer rating) {
        if (rating < 0 || rating > 5) {
            System.out.println("Некорректный рейтинг.");
        } else {
            this.rating = rating;
        }
    }

    @Override
    public String toString() {
        return String.format("[name: %s - price: %.2f | rating: %d]", name, price, rating);
    }

    public boolean equals(Product product) {
        return this.name.equals(product.getName())
                && this.price == product.getPrice()
                && this.rating == product.getRating();
    }
}
