package com.company;

public class Main {

    public static void main(String[] args) {
        Product p1 = new Product(10, "ada", "Aaa", Gender.MAN);
        Product p2 = new Product(6, "bbb", "Ccc", Gender.WOMAN);
        Product p3 = new Product(2, "vvv", "Aaa", Gender.MAN);
        Product p4 = new Product(5, "ccc", "Bbb", Gender.WOMAN);
        Product p5 = new Product(1010, "fff", "Aaa", Gender.MAN);
        Product p6 = new Product(1034, "zzz", "Aaa", Gender.MAN);

        Category c = new Category();
        c.setName("Cat1");
        c.addProduct(p1);
        c.addProduct(p2);
        c.addProduct(p3);
        c.addProduct(p4);
        System.out.println(c.toString());
        c.removeProduct();
        c.removeProduct();
        System.out.println(c.toString());

        ShoppingCart s = new ShoppingCart();
        s.setName("ShopC1");
        s.addProduct(p1);
        s.addProduct(p2);
        s.addProduct(p3);
        s.addProduct(p4);
        s.addProduct(p5);
        System.out.println(s.containsProduct(new Product(10, "ada", "Aaa", Gender.MAN)));
        System.out.println(s.totalPrice());
        s.removeProduct();
        System.out.println(s.containsProduct(new Product(10, "ada", "Aaa", Gender.MAN)));
        System.out.println(s.totalPrice());

    }
}
