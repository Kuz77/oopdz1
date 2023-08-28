package org.example;

//Домашнее задание на закрепление:
//
//        1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//        2)Создать класс Категория, имеющий переменные имя и массив товаров.
//        Создать несколько объектов класса Категория.
//        3)Создать класс Basket, содержащий массив купленных товаров.
//        4)Создать класс User, содержащий логин, пароль и объект класса Basket.
//        Создать несколько объектов класса User.
//        5)Вывести на консоль каталог продуктов. (все продукты магазина)
//        6)Вывести на консоль покупки посетителей магазина.
//        (После покупки у пользователя добавляется товар, а из магазина - удаляется)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("хлеб", 40, 5.0);
        Product product2 = new Product("молоко", 80, 4.5);
        Product product3 = new Product("гречка", 90, 4.0);
        Product product4 = new Product("рис", 90, 3.5);
        Product product5 = new Product("яйца", 100, 4.7);

        List<Product> goods = new ArrayList<>();
        goods.add(product1);
        goods.add(product2);
        goods.add(product3);
        goods.add(product4);
        goods.add(product5);

        Category category1 = new Category("Бакалея", new Product[]{product1, product3, product4});
        Category category2 = new Category("молочка", new Product[]{product2, product5});


//        System.out.println("----------------");
//        product1.prodInfo();
//        System.out.println("----------------");
//        product2.prodInfo();
//        System.out.println("----------------");
//        product3.prodInfo();
//        System.out.println("----------------");
//        product4.prodInfo();
//        System.out.println("----------------");
//        product5.prodInfo();
//        System.out.println("----------------");

        System.out.println(" ");
        System.out.println("Категория 1 = " + category1);
        System.out.println("Категория 2 = " + category2);
        System.out.println(" ");

        Product[] purchasedProducts1 = {product1,product2};
        Basket basket1 = new Basket(purchasedProducts1);

        Product[] purchasedProducts2 = {product3, product4};
        Basket basket2 = new Basket(purchasedProducts2);

        User user1 = new User("user1", "qwerty1", basket1);
        User user2 = new User("user2", "qwerty2", basket2);

        System.out.println("user1 купил " + user1);
        System.out.println("user2 купил " + user2);

        purchase(goods, purchasedProducts1);
        purchase(goods, purchasedProducts2);

        System.out.println(" ");
        System.out.println(("в магазе осталось: "+goods));
    }


    public static void purchase(List<Product> products, Product[] products2){
        for (int i = 0; i < products2.length; i++) {
            products.remove(products2[i]);
        }
    }

}