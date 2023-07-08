package Seminar01;

import java.util.List;

public class Shop {
    private List<Category> categories;


    public Shop(List<Category> categories) {
        this.categories = categories;
    }
    public Shop() {}


    public List<Category> getCategories() {
        return categories;
    }
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public boolean validProduct(Product product) {
        for (Category category : getCategories()) {
            for (Product isValid : category.getProducts()) {
                if (isValid == product) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---\n");
        for (Category category : getCategories()) {
            sb.append(String.format("%s:\n", category.getName()));
            for (Product product : category.getProducts()) {
                sb.append("\t- ").append(product).append("\n");
            }
            sb.append("---\n");
        }

        return sb.toString();
    }
}
