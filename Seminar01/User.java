package Seminar01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class User {
    private String login;
    private String password;
    private Basket basket;

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }
    public User() {}

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }
    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public void throwsInBasket(Product product, Shop shop) {
        try {
            if (!shop.validProduct(product)) {
                System.out.println("Откуда ты вообще этот продукт нашёл?");
                getBasket().getProducts().add(product);
            } else {
                getBasket().getProducts().add(product);

                for (Category category : shop.getCategories()) {
                    Iterator<Product> iterator = category.getProducts().iterator();
                    while (iterator.hasNext()) {
                        Product searchedProduct = iterator.next();
                        if (searchedProduct.equals(product)) {
                            iterator.remove();
                            break;
                        }
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {}
    }

    @Override
    public String toString() {
        return getLogin() + "'s basket:\n" +
                getBasket().toString();
    }
}
