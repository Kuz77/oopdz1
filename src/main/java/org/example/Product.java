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
public class Product {


    private String name;
    private  double price;
    private final double rating;



    public Product(String name, double price, double rating){
        this.name = name;
        this.price = price;
        this.rating = rating;
    }


    public String getName() {
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(){
        this.name = name;
    }

    public double getRating() {
        return rating;
    }
    public void setRating(){
        this.name = name;
    }

    @Override
    public String toString() {
        return "product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
    public void prodInfo(){
        System.out.println("name = " + name);
        System.out.println("price = " + price);
        System.out.println("rating = " + rating);
    }

}
