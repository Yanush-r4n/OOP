package Seminar01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shop shop = shopCreator();
        System.out.println(shop);

        Basket basket1 = new Basket();
        User user1 = new User("Yana", "Sonic1991", basket1);

        Basket basket2 = new Basket();
        User user2 = new User("Andrei", "Stalker1986", basket2);

        user1.throwsInBasket(shop.getCategories().get(0).getProducts().get(1), shop);
        user1.throwsInBasket(shop.getCategories().get(4).getProducts().get(1), shop);
        user1.throwsInBasket(shop.getCategories().get(1).getProducts().get(2), shop);

        user2.throwsInBasket(shop.getCategories().get(2).getProducts().get(1), shop);
        user2.throwsInBasket(shop.getCategories().get(2).getProducts().get(4), shop);
        user2.throwsInBasket(shop.getCategories().get(4).getProducts().get(0), shop);
        user2.throwsInBasket(shop.getCategories().get(0).getProducts().get(1), shop);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(shop);

    }

    public static Shop shopCreator() {
        List<Product> products1 = new ArrayList<>();
        List<Product> products2 = new ArrayList<>();
        List<Product> products3 = new ArrayList<>();
        List<Product> products4 = new ArrayList<>();
        List<Product> products5 = new ArrayList<>();

        Product product01 = new Product("Мороженое в рожке. Ваниль и клубника", 2.53, 5);
        products1.add(product01);
        Product product02 = new Product("Эскимо. Глазурь с арахисом с карамелью", 2.14, 3);
        products2.add(product02);
        Product product03 = new Product("Мороженое в стаканчике. Ваниль с изюмом", 1.41, 3);
        products3.add(product03);
        Product product04 = new Product("Эскимо. Джем (чёрная смородина)", 1.94, 4);
        products2.add(product04);
        Product product05 = new Product("Десерт замороженный. Березовый сок и лимон", 1.86, 2);
        products4.add(product05);
        Product product06 = new Product("Десерт замороженный. Чёрная смородина", 1.86, 3);
        products4.add(product06);
        Product product07 = new Product("Десерт замороженный. Яблоко", 1.86, 3);
        products4.add(product07);
        Product product08 = new Product("Мороженое в стаканчике. Шоколад", 1.41, 3);
        products3.add(product08);
        Product product09 = new Product("Мороженое в стаканчике. Ваниль", 1.41, 3);
        products3.add(product09);
        Product product10 = new Product("Эскимо. Глазурь с арахисом и ваниль с какао", 2.14, 4);
        products2.add(product10);
        Product product11 = new Product("Мороженое в стаканчике. Лимон и гранат", 1.65, 4);
        products3.add(product11);
        Product product12 = new Product("Мороженое в стаканчике. Ваниль и малина", 1.65, 4);
        products3.add(product12);
        Product product13 = new Product("Мороженое на бисквитах. Ваниль", 2.87, 5);
        products5.add(product13);
        Product product14 = new Product("Мороженое на бисквитах. Шоколад", 2.87, 5);
        products5.add(product14);
        Product product15 = new Product("Мороженое в стаканчике. Варёная сгущёнка", 1.53, 4);
        products3.add(product15);
        Product product16 = new Product("Эскимо. Варёная сгущёнка", 1.94, 4);
        products2.add(product16);
        Product product17 = new Product("Мороженое в рожке. Фисташки и миндаль", 2.53, 5);
        products1.add(product17);
        Product product18 = new Product("Мороженое в рожке. Варёная сгущенка и ваниль", 2.53, 5);
        products1.add(product18);

        Category category1 = new Category("Мороженое в рожках", products1);
        Category category2 = new Category("Эскимо", products2);
        Category category3 = new Category("Мороженое в стаканчиках", products3);
        Category category4 = new Category("Замороженные десерты", products4);
        Category category5 = new Category("Мороженое на бисквитах", products5);

        List<Category> categories = new ArrayList<>();
        categories.add(category1);
        categories.add(category2);
        categories.add(category3);
        categories.add(category4);
        categories.add(category5);

        return new Shop(categories);
    }


}
